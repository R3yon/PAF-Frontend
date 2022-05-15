package com.Paf.BMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
public class Bill {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cus_id")
	private String cusID;
	
	@Column(name = "cus_name")
	private String cusName;
	
	@Column(name = "no_of_watts")
	private String  noOfWatts;
	
	@Column(name = "amout")
	private String amount;
	
	@Column(name = "total")
	private String total;
	
	
	
	public Bill() {
		
	}
	
	public Bill(String cusID, String cusName, String noOfWatts, String amount, String total) {
		super();
		this.cusID = cusID;
		this.cusName = cusName;
		this.noOfWatts = noOfWatts;
		this.amount = amount;
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCusID() {
		return cusID;
	}
	public void setCusID(String cusID) {
		this.cusID = cusID;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getNoOfWatts() {
		return noOfWatts;
	}
	public void setNoOfWatts(String noOfWatts) {
		this.noOfWatts = noOfWatts;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

	
}
