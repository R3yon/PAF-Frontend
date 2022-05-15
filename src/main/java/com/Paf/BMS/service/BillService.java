package com.Paf.BMS.service;

import java.util.List;

import com.Paf.BMS.entity.Bill;

public interface BillService {
	List<Bill> getAllBills();
	
	Bill saveBill(Bill bill);
	
	
	Bill getBillById(Long id);
	Bill updateBill(Bill bill);
	
	void deleteBillById(Long id);
}
