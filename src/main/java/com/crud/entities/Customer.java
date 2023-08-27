package com.crud.entities;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int cusId;
	private String cusName;
	private String cusAge;
	private String address;
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusAge=" + cusAge + ", address=" + address
				+ "]";
	}
	public Customer(int cusId, String cusName, String cusAge, String address) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAge = cusAge;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAge() {
		return cusAge;
	}
	public void setCusAge(String cusAge) {
		this.cusAge = cusAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
