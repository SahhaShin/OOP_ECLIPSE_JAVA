package org.Practice14_14.eclipse;


public class LinkedList {
	private Object queue;
	private LinkedList next;
	

	//�ʱ�ȭ
	public LinkedList(){
		queue=null;
		next=null;	
	}
	
	//���ο� ��带 ��� ����
	public LinkedList(Object queue,LinkedList next){
		this.queue=queue;
		this.next=next;	
	}
	
	//���� ��带 ����
	public void setNext(LinkedList next){
		this.next=next;
	}
	public LinkedList getNext() {
		return next;
	}
	
	//��� ������
	public void setQueue(Object queue) {
		this.queue=queue;
	}
	
	public Object getQueue() {
		return queue;
	}

}
