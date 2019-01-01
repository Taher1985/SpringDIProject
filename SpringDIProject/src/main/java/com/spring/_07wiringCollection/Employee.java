package com.spring._07wiringCollection;

import java.util.List;

public class Employee {

	public Employee() {
		super();
	}

	private List<AddressI> addressesList;
	private List<AddressI> addressesSet;

	public void setAddressesList(List<AddressI> addressesList) {
		this.addressesList = addressesList;
	}

	public void setAddressesSet(List<AddressI> addressesSet) {
		this.addressesSet = addressesSet;
	}

	public void employeeAddressList() {
		for (AddressI address : addressesList) {
			System.out.println(address.empAddressList());
		}
	}
	
	public void employeeAddressSet() {
		for (AddressI address : addressesSet) {
			System.out.println(address.empAddressSet());
		}
	}

}
