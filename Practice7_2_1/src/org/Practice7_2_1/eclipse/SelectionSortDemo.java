package org.Practice7_2_1.eclipse;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] a= {10,9,8,7,6,5,4};
		int[] b= {7,5,11,2,16,4,18,14,12,30};
		int[] c= {1,2,3,9,8,7};
		System.out.println("1. list a\n");
		display(a,"before");
		ArraySorter.selectionSort(a);
		display(a,"after");
		System.out.println("--------------------------\n");
		
		
		System.out.println("2. list b\n");
		display(b,"before");
		ArraySorter.selectionSort(b);
		display(b,"after");
		System.out.println("--------------------------\n");
		
		
		System.out.println("3. list c\n");
		display(c,"before");
		ArraySorter.selectionSort(c);
		display(c,"after");
		System.out.println("--------------------------\n");

	}
	
	public static void display(int[] array, String when) {
		System.out.println("Array values "+when+" sorting:");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
	}

}
