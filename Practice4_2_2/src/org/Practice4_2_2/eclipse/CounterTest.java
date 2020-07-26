package org.Practice4_2_2.eclipse;

public class CounterTest {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("start from " + counter.getCount());
		System.out.println("-----------------------");
		
		counter.increseCount();
		
		System.out.println("increse: " + counter.getCount());
		
		counter.increseCount();
		
		System.out.println("increse: " + counter.getCount());
		
		counter.increseCount();
		
		System.out.println("increse: " + counter.getCount());
		
		System.out.println("-----------------------");
		
		counter.decreseCount();
		System.out.println("decrese: " + counter.getCount());
		
		counter.decreseCount();
		System.out.println("decrese: " + counter.getCount());
		
		counter.decreseCount();
		System.out.println("decrese: " + counter.getCount());
		
		counter.decreseCount();
		System.out.println("decrese: " + counter.getCount());
		
		counter.decreseCount();
		System.out.println("decrese: " + counter.getCount());
		
		
		System.out.println("-----------------------");
		counter.increseCount();
		System.out.println("increse: " + counter.getCount());
		
		counter.increseCount();
		System.out.println("increse: " + counter.getCount());
		
		counter.increseCount();
		System.out.println("increse: " + counter.getCount());
		
		System.out.println("-----------------------");

		
		counter.setCountZero();
		System.out.println("Reset -> zero: " + counter.getCount());
		

	}

}
