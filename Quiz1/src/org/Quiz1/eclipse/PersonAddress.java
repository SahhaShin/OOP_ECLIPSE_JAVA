package org.Quiz1.eclipse;

public class PersonAddress {
	private String f_name;
	private String l_name;
	private String email;
	private String phone_num;
	
	public final String nationallity="Korea";

	
	//이름 게터2 세터1
	public String getF_name() {
		return f_name;
	}


	
	public String getL_name() {
		return l_name;
	}
	
	//이름 세터메소드 뻘 라 두개
	public void setname(String L_name, String F_name) {
		this.l_name = L_name;
		this.f_name = F_name;
		
	}

	
	
	
	//이메일 폰넘버 게터 세터
	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		this.email=Email;
	}

	
	
	public String getPhone_num() {
		return phone_num;
	}
	
	public void setPhone_num(String phone) {
		this.phone_num=phone;
	}
	
	public void change_phone(String phone) {
		this.phone_num=phone;
	}
	
	public void change_email(String Email) {
		this.email=Email;
	}
	
	
	public void printout() {
		System.out.println("-------------------------");
		System.out.println("*information*");
		System.out.println("first name:"+getF_name());
		System.out.println("last name:"+getL_name());
		System.out.println("email:"+getEmail());
		System.out.println("phone_number:"+getPhone_num());
		System.out.println("nationallity: "+this.nationallity);
		System.out.println("-------------------------\n\n");
	}
	public boolean equals(PersonAddress add2) {
		return (add2.f_name==this.f_name)&&(add2.l_name==this.l_name);
		
	}



	
	
	

}
