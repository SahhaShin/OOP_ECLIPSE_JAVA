package org.Practice9_10.eclipse;

public class Employee extends Person {
	
	private int employeeID;
	private String employeeDepartment;
	
	public Employee() {
		super();
		employeeID=0;
		employeeDepartment="nothing";
	}
	
	public Employee(int ID,String name, String department) {
		super(name);
		setEmployeeID(ID);
		setEmployeeDepartment(department);
	}
	
	
	//setter method
	private void setEmployeeID(int id) {
		this.employeeID=id;
	}
	private void setEmployeeDepartment(String department) {
		this.employeeDepartment=department;
	}
	
	//getter method
	private String getEmployeeDepartment() {
		return employeeDepartment;
	}
	
	private int getEmployeeID() {
		return employeeID;
	}
	
	public void writeOutput() {
		super.writeOutput();//name
		System.out.println("Employee ID: "+getEmployeeID());
		System.out.println("Employee Department: "+getEmployeeDepartment());
		
	}
	
	

}
