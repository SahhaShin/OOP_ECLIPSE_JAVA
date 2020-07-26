package org.Practice9_1_2.eclipse;

public class DoctorPlay {

	public static void main(String[] args) {
		String script;
		
		System.out.println("new Doctor1 create...");
		Doctor doctor1=new Doctor();
		System.out.println("Doctor1 information...");
		script=doctor1.toString();
		System.out.println(script);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("new Doctor2 create...");
		Doctor doctor2=new Doctor("SHINSANHA",Specialty.Medicine,10000.0);
		System.out.println("Doctor2 information...");
		script=doctor2.toString();
		System.out.println(script);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("new Doctor1 setName...\n");
		doctor1.setName("SHINMINHA");
		
		System.out.println("new Doctor1 setVisit_fee...\n");
		doctor1.setVisit_fee(8000.0);
		
		System.out.println("new Doctor1 specialty...\n");
		doctor1.setSpecialty(Specialty.Dentist);
		
		System.out.println("Doctor1 information...");
		script=doctor1.toString();
		
		System.out.println(script);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("new Doctor3 create...");
		Doctor doctor3=new Doctor("SHINSUSAN",Specialty.Surgery,11000.0);
		System.out.println("Doctor3 information...");
		script=doctor3.toString();
		
		System.out.println(script);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("new Doctor4 create...");
		Doctor doctor4=new Doctor("SHINSUSAN",Specialty.Surgery,11000.0);
		System.out.println("Doctor4 information...");
		script=doctor4.toString();
		System.out.println(script);
		System.out.println("\n-------------------------------\n");
		
		System.out.println("new Doctor5 create...");
		Doctor doctor5=new Doctor("SHINSAMSUB",Specialty.Oriental,7000.0);
		System.out.println("Doctor5 information...");
		script=doctor5.toString();
		
		System.out.println(script);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("doctor1 and doctor4, they are same? "+doctor1.equals(doctor4));
		
		System.out.println("doctor3 and doctor4, they are same? "+doctor3.equals(doctor4));
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("doctor5 setVisit_fee -1000 won");
		doctor5.setVisit_fee(-1000.0);
		
		
		

	}

}
