package org.Practice14_14.eclipse;

import java.util.LinkedList;

public class LinkedQueuePlay {

	public static void main(String[] args) {
		
		Object item;
		LinkedQueue queue=new LinkedQueue();
		
		queue.addToQueue("one");
		queue.addToQueue("two");
		queue.addToQueue("three");
		
		item=queue.removeFromQueue();
		System.out.println(">delete item: "+item+"\n");
		item=queue.removeFromQueue();
		System.out.println(">delete item: "+item+"\n");
		item=queue.removeFromQueue();
		System.out.println(">delete item: "+item+"\n");
		item=queue.removeFromQueue();
		System.out.println(">delete item: "+item+"\n");
		
		
		
		
		
		

	}

}
