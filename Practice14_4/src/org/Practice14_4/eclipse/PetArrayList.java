package org.Practice14_4.eclipse;

import java.util.ArrayList;
import java.util.Scanner;

public class PetArrayList {
	
	
	public static void nameSort(ArrayList<Pet> pet) {
		for(int i=0;i<pet.size();i++) {
			
			//앞의 인덱스 오브젝트가 더 크면 위치 수정
			for(int j=0;j<pet.size()-i-1;j++) {
				
				String next_pet=pet.get(j+1).getName();
				
				if(pet.get(j).getName().compareTo(next_pet)>0){
					System.out.println("1");
					Pet temp=pet.get(j);//앞 인덱스 오브젝트를 가지고 있음
					pet.set(j, pet.get(j+1));
					pet.set(j+1, temp);
					
				}
			}
		}
			
		
	}

	public static void main(String[] args) {
		
		ArrayList<Pet> pet=new ArrayList<Pet>();
		Scanner keyboard = new Scanner(System.in);
		
		int go=1;
		while(go!=-1) {
			System.out.print("\nPlease Enter a pet name: ");
			
			String pet_name=keyboard.next();
			System.out.print("Please Enter a pet age: ");
			int pet_age=keyboard.nextInt();
			System.out.print("Please Enter a pet weight: ");
			double pet_weight=keyboard.nextDouble();
			
			Pet pet1=new Pet(pet_name,pet_age,pet_weight);
			pet.add(pet1);//객체를 넣을 수 있음
			
			
			System.out.println();
			System.out.print("continue?(1->go /-1->stop) : ");
			go=keyboard.nextInt();
			if(go==-1) {
				continue;
			}
		}//end while
		
		//sort
		PetArrayList.nameSort(pet);
		
		//print
		for(int i=0;i<pet.size();i++) {
			System.out.println("--------------information--------------------");
			System.out.println("name: "+pet.get(i).getName());
			System.out.println("age: "+pet.get(i).getAge());
			System.out.println("weight: "+pet.get(i).getWeight());
			System.out.println("---------------------------------------------");
		}

	}

}
