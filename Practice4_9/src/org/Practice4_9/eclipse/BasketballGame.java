package org.Practice4_9.eclipse;

public class BasketballGame {

		private String team1, team2;
		private int team1Score, team2Score, score;
		private boolean gameStatus;
	

		public final int onePointScore(){
			return score = 1;
		}

		
		public final int twoPointScore(){
			return score = 2;
		}

		
		public final int threePointScore(){
			return score = 3;
		}

		
		public int setTeam1Score(){
			return team1Score += score;
		}

		/*No input required.
		Returns current score of team one.*/
		public int getTeam1Score(){
			return team1Score;
		}

		/*No input required.
		Will add score to current team score and return the result.*/
		public int setTeam2Score(){
			return team2Score += score;
		}

		/*No input required.
		Returns current score of team two.*/
		public int getTeam2Score(){
			return team2Score;
		}
		//****************************************************************

		//Team Setting
		//****************************************************************
		/*String is required for parameter.
		Return name of team one.*/
		public String setTeam1Name(String teamName){
			return team1 = teamName;
		}

		/*No input required.
		Return name of teamOne*/
		public String getTeam1Name(){
			return team1;
		}

		/*String is required for parameter.
		Return name of team two.*/
		public String setTeam2Name(String teamName){
			return team2 = teamName;
		}

		/*No input required.
		Return name of team two*/
		public String getTeamName2(){
			return team2;
		}
		//****************************************************************


		//Result of current game
		//****************************************************************
		/*No input required.
		Shows results of team that is currently winning.*/
		public void Winning(){
			if(team1Score > team2Score){
				System.out.println(team1 + " are winning.");
			}
			else if(team2Score > team1Score){
				System.out.println(team2 + " are winning.");
			}
			else{
				System.out.println("Game is a draw.");
			}
		}

		/*No input required.
		Shows results of team that wins.*/
		public void Win(){
			if(team1Score > team2Score){
				System.out.println(team1 + " Final winner.");
			}
			else if(team2Score > team1Score){
				System.out.println(team2 + " Final winner.");
			}
			else{
				System.out.println("Game is a Final draw.");
			}
		}

		/*Input require a true or false.
		*If true, the game is still in progress and
		*team score will be returned.
		*If false, the game is finished and final
		score will be returned.*/
		public void Active(boolean active){
			gameStatus = active;

			if(gameStatus == true){
				System.out.println("\n************************");
				
				System.out.println(team1 +" "+ team1Score+", "+team2 +" "+ team2Score+"; ");
				Winning();
				System.out.println("************************\n");
			}
			else{
				System.out.println("\n************************");
				
				System.out.println("Final score:");
				System.out.println(team1 + ": " + team1Score);
				System.out.println(team2 + ": " + team2Score);
				Win();
				System.out.println("************************\n");
				System.exit(0);
			}

	}

}
