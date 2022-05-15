package com.Paf.BMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paf.BMS.entity.Bill;

public interface BillRepository extends JpaRepository<Bill , Long> {
	

}
