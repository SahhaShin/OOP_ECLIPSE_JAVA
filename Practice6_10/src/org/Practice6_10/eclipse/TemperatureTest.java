package org.Practice6_10.eclipse;

public class TemperatureTest {

	public static void main(String[] args) {
		System.out.println("create temperature1...\n");
		Temperature temp1=new Temperature();
		System.out.println("create temperature2(32.0 F)...\n");
		Temperature temp2=new Temperature(32.0,'F');
		System.out.println("create temperature3(-32.0)...\n");
		Temperature temp3=new Temperature(-32.0);
		System.out.println("create temperature4(F)...\n");
		Temperature temp4=new Temperature('F');
		System.out.println("create temperature5(100.0 C)...\n");
		Temperature temp5=new Temperature(100.0,'C');
		System.out.println("create temperature6...\n");
		Temperature temp6=new Temperature();
		System.out.println("----------------------------------------------\n\n");
		
		System.out.println("temperature3 setScale C...\n");
		temp3.setScale('C');
		
		System.out.println("temperature4 setDgrees -100.0...\n");
		temp4.setDgrees(-100.0);
		
		System.out.println("temperature6 setDegreeScale -212.0 F...\n");
		temp6.setDegreesScale(212.0, 'F');
		System.out.println("----------------------------------------------\n\n");
		
		System.out.println("temperature5 C> "+temp5.getDegreesCelius());
		System.out.println("temperature5 Change F> "+temp5.getDegreesFahrenheit());
		System.out.println("----------------------------------------------\n\n");
		
		System.out.println("equal method\n");
		System.out.println("temperature5: "+temp5.toString()+" & "+"temperature6: "+temp6.toString()+" Equal? "+temp5.isEqualTemperature(temp6));
		System.out.println("temperature2: "+temp2.toString()+" & "+"temperature3: "+temp3.toString()+" Equal? "+temp2.isEqualTemperature(temp3));
		System.out.println("----------------------------------------------\n\n");
		
		System.out.println("less method\n");
		System.out.println("temperature1: "+temp1.toString()+" & "+"temperature5: "+temp5.toString()+" Less? "+temp1.isLessTemperature(temp5));
		System.out.println("temperature3: "+temp3.toString()+" & "+"temperature4: "+temp4.toString()+" Less? "+temp3.isLessTemperature(temp4));
		System.out.println("----------------------------------------------\n\n");
		
		System.out.println("greater method\n");
		System.out.println("temperature6: "+temp6.toString()+" & "+"temperature2: "+temp2.toString()+" Greater? "+temp6.isGreaterTemperature(temp2));
		System.out.println("temperature4: "+temp4.toString()+" & "+"temperature1: "+temp1.toString()+" Greater? "+temp4.isGreaterTemperature(temp1));
		System.out.println("----------------------------------------------\n\n");
		
		
		
		

	}

}
