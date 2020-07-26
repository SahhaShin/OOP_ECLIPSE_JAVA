package org.Practice4_9.eclipse;
import java.util.Scanner;
public class BasketballGameDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		BasketballGame game1 = new BasketballGame();
		
		boolean active = true, error = true;
		
		int getScore;
		String name;
		
		//팀 이름 받고 , 셋팅
		System.out.print("Please Enter a team1 Name:");
		String team1Name = keyboard.nextLine();
		game1.setTeam1Name(team1Name);

		System.out.print("Please Enter a team2 Name:");
		String team2Name = keyboard.nextLine();
		game1.setTeam2Name(team2Name);

		//게임 시작
		
		do{
			do{
				System.out.print("Please Enter a winning team name and score (ex. a 3):");
				String winningTeamName = keyboard.next();
				
				int winningTeamScore=keyboard.nextInt();
				name=winningTeamName;
				getScore=winningTeamScore;
				
				//점수는 0~3점사이
				if((getScore > 3 || getScore < 0)){
					System.out.println("ERROR1: Please Enter Score 1 or 2 or 3\n");
				}
				if(!(name.equalsIgnoreCase(team1Name))&&!(name.equalsIgnoreCase(team2Name))) {
					System.out.println("ERROR2: Please Enter Correct team name\n");
				}

				else{
					active = true;
					error = false;
				}
			}while(error);

			if(name.equalsIgnoreCase(team1Name)){
				switch (getScore){
				
				case 1:
					game1.onePointScore(); //score=1
					game1.setTeam1Score();//score+=1
					break;
				case 2:
					game1.twoPointScore();
					game1.setTeam1Score();
					break;
				case 3:
					game1.threePointScore();
					game1.setTeam1Score();
					break;
				}
			}
			else if(name.equalsIgnoreCase(team2Name)) {
				switch (getScore){
				case 1:
					game1.onePointScore();//score=1
					game1.setTeam2Score();//score+=1
					break;
				case 2:
					game1.twoPointScore();
					game1.setTeam2Score();
					break;
				case 3:
					game1.threePointScore();
					game1.setTeam2Score();
					break;
				}
			}

		game1.Active(true);
		
		int end;
		System.out.print("Please Enter 0 or 1, (Continue:1 or Finish:0): ");
		end=keyboard.nextInt();
		
		switch(end) {
		case 0:
			System.out.println("Finish!!!\n");
			game1.Win();
			game1.Active(false);
		case 1:
			System.out.println("progress!!!\n");
		
		}
		
		

		}while(active);
	
	}

}
