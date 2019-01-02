package com.spring._11wiringexpressionreference;

public class Employee {

	private String name;
	private Address address;
	private String nameRefProperties;
	private String cityRefMethod;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setNameRefProperties(String nameRefProperties) {
		this.nameRefProperties = nameRefProperties;
	}

	public void setCityRefMethod(String cityRefMethod) {
		this.cityRefMethod = cityRefMethod;
	}

	public void employeeAddress() {
		System.out.println("Employee name is " + name + " and address is "
				+ address.empAddress() + " " + nameRefProperties + " " +cityRefMethod);
	}

}
