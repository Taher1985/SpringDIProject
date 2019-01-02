package com.spring._07wiringCollection;

public class Address3 implements AddressI {

	public Address3() {
		super();
	}

	public String empAddressList() {
		return "City is Delhi";
	}

	@Override
	public String empAddressSet() {
		return "City is Surat";
	}
}
