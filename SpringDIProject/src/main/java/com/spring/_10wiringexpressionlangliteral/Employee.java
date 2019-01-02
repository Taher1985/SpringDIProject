package com.spring._10wiringexpressionlangliteral;

public class Employee {

	private String empName;

	private int empId;

	private boolean empExist;

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpExist(boolean empExist) {
		this.empExist = empExist;
	}

	public void perform() {
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(empExist);
	}
}
