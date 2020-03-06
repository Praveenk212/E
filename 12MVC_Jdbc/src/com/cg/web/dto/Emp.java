package com.cg.web.dto;

public class Emp {
	
	private int empId;
	private String firstName;
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}
	private float salary;
	
	public Emp() {
		super();
	}
	public Emp(int empId, String firstName, float salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
