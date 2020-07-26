package org.Practice14_14.eclipse;


public class LinkedList {
	private Object queue;
	private LinkedList next;
	

	//초기화
	public LinkedList(){
		queue=null;
		next=null;	
	}
	
	//새로운 노드를 계속 생성
	public LinkedList(Object queue,LinkedList next){
		this.queue=queue;
		this.next=next;	
	}
	
	//다음 노드를 설정
	public void setNext(LinkedList next){
		this.next=next;
	}
	public LinkedList getNext() {
		return next;
	}
	
	//노드 아이템
	public void setQueue(Object queue) {
		this.queue=queue;
	}
	
	public Object getQueue() {
		return queue;
	}

}
