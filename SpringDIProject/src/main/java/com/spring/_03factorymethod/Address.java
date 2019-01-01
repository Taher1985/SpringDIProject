package com.spring._03factorymethod;

public class Address {

	private String city;
	private static Address address;

	private Address(String city) {
		super();
		this.city = city;
	}

	public static Address getAddressInstance() {
		if (address == null) {
			return new Address("Indore");
		} else {
			return address;
		}
	}

	public String empAddress() {
		return city;
	}
}
