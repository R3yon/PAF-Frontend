package com.Paf.BMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Paf.BMS.entity.Bill;
import com.Paf.BMS.service.BillService;

@Controller
public class BillController {
	private BillService billService;
	
	public BillController(BillService billService) {
		super();
		this.billService = billService;
	}
	
	//Handler method to handle list students and return mode and view
	@GetMapping("/bills")
	public String listBills(Model model) {
		model.addAttribute("bills", billService.getAllBills());
		return "bills";
	}
	
	@GetMapping("/bills/new")
	public String createBillForm(Model model) {
		//create bill object to hold bill form data
		Bill bill = new Bill();
		model.addAttribute("bill",bill);
		return "create_bill";
	}
	@PostMapping("/bills")
	public String saveBill(@ModelAttribute("bill") Bill bill) {
		billService.saveBill(bill);
		return "redirect:/bills";
		}
	
	@GetMapping("/bills/edit/{id}")
	public String editBillForm(@PathVariable Long id, Model model) {
		model.addAttribute("bill", billService.getBillById(id));
		return "edit_bill";
		
	}
	
	@PutMapping("/bills/{id} ")
	public String updateBill(@PathVariable Long id,
			@ModelAttribute("bill") Bill bill,
			Model model) {
		//get bill from db by id
		
		Bill existingBill = billService.getBillById(id);
			existingBill.setId(id);
			existingBill.setCusID(bill.getCusID());
			existingBill.setCusName(bill.getCusName());
			existingBill.setNoOfWatts(bill.getNoOfWatts());
			existingBill.setAmount(bill.getAmount());
			existingBill.setTotal(bill.getTotal());
		
		//save updated bill object
		billService.updateBill(existingBill);
		return "redirect:/bills";
		}
	@DeleteMapping("/bills/{id}")
	public String deleteBill(@PathVariable Long id) {
		billService.deleteBillById(id);
		return "redirect:/bills";
		
	}
	
	

}
