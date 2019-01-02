package com.spring._06injectinginnerbeans;

public class Employee {

	private Address address;

	public Employee() {
		super();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void employeeAddress() {
		System.out.println("Address is " + address.empAddress());
	}

}
