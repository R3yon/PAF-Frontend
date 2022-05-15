package com.Paf.BMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Paf.BMS.entity.Bill;
import com.Paf.BMS.repository.BillRepository;
import com.Paf.BMS.service.BillService;

@Service 
public class BillServiceImpl implements BillService{

	private BillRepository billRepository;
	
	
	public BillServiceImpl(BillRepository billRepository) {
		super();
		this.billRepository = billRepository;
	}


	@Override
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}


	@Override
	public Bill saveBill(Bill bill) {
		return billRepository.save(bill);
	}


	@Override
	public Bill getBillById(Long id) {
		return billRepository.findById(id).get();
			}


	@Override
	public Bill updateBill(Bill bill) {
		return billRepository.save(bill);
	}


	@Override
	public void deleteBillById(Long id) {
		billRepository.deleteById(id);
		
	}

}
