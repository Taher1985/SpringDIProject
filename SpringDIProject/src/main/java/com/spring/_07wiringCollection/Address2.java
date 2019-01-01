package com.spring._07wiringCollection;

public class Address2 implements AddressI {

	public Address2() {
		super();
	}

	public String empAddressList() {
		return "City is Mumbai";
	}

	@Override
	public String empAddressSet() {
		return "City is Patna";
	}
}
