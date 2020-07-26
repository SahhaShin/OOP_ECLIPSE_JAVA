package org.Practice12_9.eclipse;

public class Grains {
	
	public static int total=0;
	
	public static int getTotalGrains(int squares, int grains) {
		if(squares==1) {
			return 1;
		}
		else {
			total=grains+grains;
		}
		getTotalGrains(squares-1, total);
		return total;
	}

}
