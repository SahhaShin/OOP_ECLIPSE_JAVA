package org.Practice7_2_2.eclipse;

public class OperationPlay {

	public static void main(String[] args) {
		double[][] arr1= {{1,2,3},{4,5,6}};
		
		System.out.print("arr1={");
		for(int i=0;i<arr1.length;i++) {
			System.out.print("{");
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]);
				if(j!=arr1[i].length-1) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			if(i==0) {
				System.out.print(",");
			}
			if(i==1) {
				System.out.println("}\n");
			}
		}
		
		Operation arr1_ob=new Operation();
		System.out.println("method1. getSum: arr1, row0");
		double result=arr1_ob.getSum(arr1, 0);
		System.out.println("> "+result+"\n");
		
		System.out.println("method1. getSum: arr1, row1");
		result=arr1_ob.getSum(arr1, 1);
		System.out.println("> "+result+"\n");
		System.out.println("---------------------------------\n");
		
		System.out.println("method2. getAverage: arr1, col0");
		result=arr1_ob.getAverage(arr1, 0);
		System.out.println("> "+result+"\n");
		
		System.out.println("method2. getAverage: arr1, col1");
		result=arr1_ob.getAverage(arr1, 1);
		System.out.println("> "+result+"\n");
		
		System.out.println("method2. getAverage: arr1, col2");
		result=arr1_ob.getAverage(arr1, 2);
		System.out.println("> "+result+"\n");
		System.out.println("---------------------------------\n");
		
		
		
		
		

	}

}
