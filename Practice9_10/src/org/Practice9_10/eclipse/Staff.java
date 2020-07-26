package org.Practice9_10.eclipse;

public class Staff extends Employee{
	
	private int payGrade;
	
	public Staff() {
		super();
	}
	
	public Staff(int id,String name, String department, int payGrade) {
		super(id,name,department);
		setPayGrade(payGrade);
	}
	
	
	//setter getter method
	public void setPayGrade(int payGrade) {
		if((payGrade>=1)&&(payGrade<=20)){
			this.payGrade=payGrade;
		}
		else {
			System.out.println("invalid\n");
		}
	}
	
	public int getGrade() {
		return payGrade;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Employee Pay Grade: "+getGrade());
	}
	

}
