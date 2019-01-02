package com.spring._12siftingthroughcollections;

import java.util.List;

public class Employee {

	private String empName;
	private String empDep;
	private int empId;
	private List<Employee> employeesList;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}

	public void empDetailsList() {

		for (Employee employee : employeesList) {
			System.out.println("Name of employee :" + employee.getEmpName()
					+ ", Dep of employee :" + employee.getEmpDep()
					+ " ID of employee :" + employee.getEmpId());
		}
	}

}
