package org.Practice11_7.eclipse;
import java.util.Scanner;
public class EmployeePlay {

	public static void main(String[] args) {
		int count=0;
		int more=1;
		double total_salary=0.0;
		double average_salary=0.0;
		System.out.println("create employee1...\n");
		Employee employee1=new Employee();
		
		Employee[] employee100=new Employee[100];
		
		try {
			while (count<100&&more==1) {
				more=employee1.inputEmployee(employee100, count);
				count++;
			}
			
			if(count==100) {
				System.out.println(">100 PEOPLE!\n");
				
			}
			
			
		}
		catch(SSNLengthException e){
			System.out.println(e.getMessage());
		}
		catch(SSNCharacterException m) {
			System.out.println(m.getMessage());
		}
		System.out.println("\n----------------result-------------------\n");
		for(int i=0;i<count;i++) {
			total_salary+=employee100[i].getSalary();
		}
		average_salary=total_salary/count;
		System.out.println("Salary average: "+average_salary+"\n");
		for(int j=0;j<count;j++) {
			employee100[j].writeOutput();
			
			if(employee100[j].getSalary()>average_salary) {
				System.out.println("Above salary\n");
					
			}
			else if(employee100[j].getSalary()<average_salary) {
				System.out.println("Below salary\n");
			}
			else {
				System.out.println("Average salary\n");
			}
		}
		
		
		System.out.println("\n-----------------------------------------\n");

	}

}
