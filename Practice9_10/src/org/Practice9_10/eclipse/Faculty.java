package org.Practice9_10.eclipse;

public class Faculty extends Employee {
	
	private String fac_mem_Title;
	
	public Faculty() {
		super();
		fac_mem_Title="nothing";
	}
	
	public Faculty(int id, String name, String department,String fac_mem_Title) {
		super(id,name,department);
		setFacMemTitle(fac_mem_Title);
	}
	
	//setter getter method
	public void setFacMemTitle(String fac_mem_Title) {
		this.fac_mem_Title=fac_mem_Title;
	}
	public String getFacMemTitle() {
		return fac_mem_Title;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Employee Member Title: "+getFacMemTitle());
	}
	
	

}
