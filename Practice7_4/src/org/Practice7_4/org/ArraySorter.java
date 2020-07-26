package org.Practice7_4.org;

public class ArraySorter {
	
	public static void selectionSort(int[] anArray) {
		for(int index=0; index<anArray.length-1;index++) {
			int indexOfNextSmallest=getIndexOfSmallest(index,anArray);
			interchange(index, indexOfNextSmallest,anArray);
			
		}
	}
	
	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min=a[startIndex];
		int indexOfMin=startIndex;
		
		for(int index=startIndex+1;index<a.length;index++) {
			if(a[index]<min) {
				min=a[index];
				indexOfMin=index;
				
			}
		}
		return indexOfMin;
	}
	
	private static void interchange(int i, int j, int[] a) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
	public static void bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int index=0;index<a.length-1;index++) {
				if(a[index]>a[index+1]) {
					interchange(index, index+1,a);
				
				}
			}
		}
	}

}
