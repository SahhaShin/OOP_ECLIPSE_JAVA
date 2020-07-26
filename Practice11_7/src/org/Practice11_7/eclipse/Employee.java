package org.Practice11_7.eclipse;
import java.util.Scanner;
public class Employee extends Person {
	
	private String ssn;
	private double salary;
	
	public Employee() {
		super();
		ssn="No SSN data";
		salary=0.0;
	}
	
	public Employee(String name,String ssn, double salary)throws SSNLengthException,SSNCharacterException {
		super(name);
		setSSN(ssn);
		setSalary(salary);
	}
	
	public void setSSN(String new_ssn) throws SSNLengthException,SSNCharacterException {
		int charCount=0;
		int digitCount=0;
		
		for(int i=0;i<new_ssn.length();i++) {
			if(new_ssn.charAt(i)!=' '&&new_ssn.charAt(i)!='-') {
				charCount++;
			}
			if(new_ssn.charAt(i)>='0'&&new_ssn.charAt(i)<='9') {
				digitCount++;
			}
		}
		if(charCount!=9) {
			throw new SSNLengthException();
		}
		if(digitCount!=9) {
			throw new SSNCharacterException();
		}
		ssn=new_ssn;
	}
	
	
	public void setSalary(double new_salary){
		salary=new_salary;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("SSN: "+ssn);
		System.out.println("Salary: "+salary);
	}
	
	public int inputEmployee(Employee[] emp,int count) throws SSNLengthException,SSNCharacterException {
		
		Scanner keyboard=new Scanner(System.in);
		
		emp[count]=new Employee();
		
		System.out.print("Please Enter a name: ");
		String name=keyboard.next();
		
		emp[count].setName(name);
		
		System.out.print("Please Enter a SSN: ");
		String ssn=keyboard.next();
		
		emp[count].setSSN(ssn);
		
		System.out.print("Please Enter a salary: ");
		double salary=keyboard.nextDouble();
		
		emp[count].setSalary(salary);
		
		System.out.println("One more?(1:yes / 2:no)");
		int more=keyboard.nextInt();
		
		return more;
	}
	


}
