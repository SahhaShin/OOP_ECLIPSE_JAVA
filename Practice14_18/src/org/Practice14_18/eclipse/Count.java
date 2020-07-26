package org.Practice14_18.eclipse;
import java.util.Scanner;
import java.util.HashMap;
public class Count {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> count=new HashMap<Integer, Integer>();
		
		Scanner keyboard=new Scanner(System.in);
		
		int go=1;
		
		while(go!=-1) {
			System.out.print("Please Enter a number(-1 -> end): ");
			Integer num=keyboard.nextInt();
			if(num<0) {
				if(num==-1) {
					break;
				}
				else {
					System.out.println("Please Enter a positive number");
					continue;
				}
			}
			else {
				if(count.containsKey(num)) {
					//이미 카운트 된 게 있으면 기록가져오기
					Integer store_num=count.get(num);
					count.put(num, ++store_num);
				}
				else {
					//처음이면 1을 넣어줘라
					count.put(num, 1);
				}
			}
		}
		
		for(Integer turn: count.keySet()) {
			System.out.println("The number "+turn+" occurs "+count.get(turn)+" times. ");
		}
		

	}

}
