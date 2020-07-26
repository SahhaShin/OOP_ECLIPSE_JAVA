package org.Practice14_14.eclipse;

public class LinkedQueue extends LinkedList {

	private LinkedList front;//��ũ�帮��Ʈ �� ����Ʈ�� ������ �������

	private int count;
	
	//�ʱ⼳��
	public LinkedQueue() {
		super();
		front=null;
		count=0;
	}
	
	//���� Ÿ���� item�� ���� �𸣴ϱ� object��
	public void addToQueue(Object item) {
		//��尡 ����� ��� ���ο� ��带 �����Ѵ�.
		if(front==null) {
			front=new LinkedList(item,null);
		}
		//��尡 �� ����� ��� ���ο� ��带 �ڿ� �̾���
		else {
			LinkedList newnode=new LinkedList(item,null);//���ο� ��� ����
			LinkedList ptr=front;//ù��带 ptr�� �����ϰ� ������带 Ž��
			
			//������尡 �ִ��� Ž��, ������尡 �ִٸ� ptr�� �ٲ���, ���ٸ� �״��
			while(ptr.getNext()!=null) {
				ptr=ptr.getNext();
			}
			
			ptr.setNext(newnode);
		}
		
		
		System.out.println(">add item: "+item+"\n");
		count++;
	}
	
	public Object removeFromQueue() {
		if(isEmpty()) {
			return null;
		}
		else {
			Object remove=front.getQueue();//����Ʈ����ָ� ������
			front=front.getNext();//����Ʈ�� ���� ���� �ٲ���
			count--;//������ 1�� ����
			return remove;
		}
	}
	
	public boolean isEmpty() {
		if(count==0) {
			System.out.println(">isEmpty!\n");
			return true;
		}
		else {
			return false;
		}
	}

}
