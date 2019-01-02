package com.spring._07wiringCollection;

public class Address1 implements AddressI {

	public Address1() {
		super();
	}

	public String empAddressList() {
		return "City is Indore";
	}

	@Override
	public String empAddressSet() {
		return "City is Hyderabad";
	}
}
