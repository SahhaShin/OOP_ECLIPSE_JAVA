package org.Practice4_2_2.eclipse;

public class Counter {

	private int count;
	
	public Counter() {
		count = 0;
	}
	
	public void setCountZero() {
		count = 0;
	}
	
	public void increseCount() {
		count++;
	}
	
	public void decreseCount() {
		if(count > 0)
			count--;
	}
	
	public int getCount() {
		return count;
	}	
	
	public void setCount(int count) {
		this.count = count;
	}

}
