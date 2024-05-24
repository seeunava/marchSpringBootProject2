package com.dto;

public class EmployeeDTO {

	private int employeeId;
	private String employeeName;
	private int salary;
	private String emailId;
	private String password;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(int employeeId, String employeeName, int salary, String emailId, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.emailId = emailId;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	
	
	
	
}