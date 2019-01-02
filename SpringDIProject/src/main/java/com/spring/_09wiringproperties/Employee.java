package com.spring._09wiringproperties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Employee {

	public Employee() {
		super();
	}

	private Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void employeeAddressProperties() {
		Set set = properties.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key + " " + properties.getProperty(key));
		}
	}

}
