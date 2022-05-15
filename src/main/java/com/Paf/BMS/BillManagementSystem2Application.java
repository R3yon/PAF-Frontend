package com.Paf.BMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.Paf.BMS.controller.BillController;
import com.Paf.BMS.entity.Bill;
import com.Paf.BMS.repository.BillRepository;

@SpringBootApplication
public class BillManagementSystem2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BillManagementSystem2Application.class, args);
	}

	@Autowired
	private BillRepository billRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Bill bill1 = new Bill("cus123","Ramesh","50","1000","50000");
		billRepository.save(bill1);
		Bill bill2 = new Bill("cus124","Jayan","60","1000","60000");
		billRepository.save(bill2);*/
		
	}
	

}
