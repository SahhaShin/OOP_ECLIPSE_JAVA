package org.Practice14_14.eclipse;

public class LinkedQueue extends LinkedList {

	private LinkedList front;//링크드리스트 중 프론트의 정보가 들어있음

	private int count;
	
	//초기설정
	public LinkedQueue() {
		super();
		front=null;
		count=0;
	}
	
	//무슨 타입의 item이 올지 모르니까 object형
	public void addToQueue(Object item) {
		//노드가 비었을 경우 새로운 노드를 시작한다.
		if(front==null) {
			front=new LinkedList(item,null);
		}
		//노드가 안 비었을 경우 새로운 노드를 뒤에 이어줌
		else {
			LinkedList newnode=new LinkedList(item,null);//새로운 노드 생성
			LinkedList ptr=front;//첫노드를 ptr에 배정하고 다음노드를 탐색
			
			//다음노드가 있는지 탐색, 다음노드가 있다면 ptr을 바꿔줌, 없다면 그대로
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
			Object remove=front.getQueue();//프론트지울애를 가져옴
			front=front.getNext();//프론트를 다음 노드로 바꿔줌
			count--;//갯수도 1개 줄임
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
