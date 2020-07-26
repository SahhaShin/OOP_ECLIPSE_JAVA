package org.Practice7_2_2.eclipse;

public class Operation {

	public static double getSum(double[][]arr,int row) {
		int row_len=arr[row].length;
		double sum=0;
		for(int i=0;i<row_len;i++) {
			sum=sum+arr[row][i];
		}
		return sum;
	}
	
	public static double getAverage(double[][] arr, int column) {
		int col_len=arr.length;
		double sum=0;
		double avg=0;
		for(int i=0;i<col_len;i++) {
			sum=sum+arr[i][column];
		}
		avg=sum/col_len;
		return avg;
	}

}
