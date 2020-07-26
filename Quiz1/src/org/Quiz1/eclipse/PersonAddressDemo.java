package org.Quiz1.eclipse;

public class PersonAddressDemo {

	public static void main(String[] args) {
		PersonAddress add1=new PersonAddress();
		System.out.println("*start object add1*\n");
		System.out.println("\n-----set last and first name-----");
		add1.setname("Shin", "Sanha");
		System.out.println("\n-----set email-----");
		add1.setEmail("tksgk2598@naver.com");
		System.out.println("\n-----set phone number-----");
		add1.setPhone_num("010-3705-4036");
		System.out.println("\n-----set phone number-----");
		System.out.println("\n-----final -> constants nationality-----");
		
		add1.printout();
		
		System.out.println("\n\n----chage the phone number-----");
		add1.change_phone("010-1234-5678");
		add1.printout();
		System.out.println("\n\n----chage the email-----");
		add1.change_email("tksgkthsu@naver.com");
		add1.printout();
		
		PersonAddress add2=new PersonAddress();
		System.out.println("\n\n*start object add2*\n");
		System.out.println("\n-----set last and first name-----");
		add2.setname("Shin", "Sanha");
		System.out.println("\n-----set email-----");
		add2.setEmail("tksgk2598@gmail.com");
		System.out.println("\n-----set phone number-----");
		add2.setPhone_num("010-3705-1234");
		System.out.println("\n-----final constants nationality-----");
		
		add2.printout();
		
		
		System.out.println("add1 and add2 first & last name equal?: "+add1.equals(add2));
		
	
		

	}

}
