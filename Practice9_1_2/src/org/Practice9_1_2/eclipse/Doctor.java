package org.Practice9_1_2.eclipse;

public class Doctor extends Person {
	
	private double visit_fee;
	private Specialty specialty;

	//setter&getter
	public double getVisit_fee() {
		return visit_fee;
	}
	public void setVisit_fee(double visit_fee) {
		if(visit_fee<0) {
			System.out.println(">invalid fee\n");
			System.exit(0);
		}
		else
			this.visit_fee = visit_fee;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	
	//constructor
	public Doctor() {
		super();
	}
	public Doctor(String name,Specialty specialty, double fee) {
		super(name);
		setVisit_fee(fee);
		setSpecialty(specialty);
	}
	
	public String toString() {
		return "\nName: "+getName()+"\nVisit_fee: "+getVisit_fee()+" won"+"\nSpecial fee: "+getSpecialty();
	}
	
	public boolean equals(Object otherobject) {
		//check the validity
		if(!(otherobject!=null&&otherobject instanceof Doctor))
			return false;
		Doctor otherDoctor=(Doctor)otherobject;
		return this.hasSameName(otherDoctor)&&this.visit_fee==otherDoctor.visit_fee&&this.specialty==otherDoctor.specialty;
	}


}
