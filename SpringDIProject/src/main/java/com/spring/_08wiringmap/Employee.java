package com.spring._08wiringmap;

import java.util.Map;

public class Employee {

	public Employee() {
		super();
	}

	private Map<AddressI, String> addressesMap;

	public void setAddressesMap(Map<AddressI, String> addressesMap) {
		this.addressesMap = addressesMap;
	}

	public void employeeAddressMap() {

		for (AddressI addressI : addressesMap.keySet()) {
			System.out.println(addressesMap.get(addressI));
		}

	}

}
