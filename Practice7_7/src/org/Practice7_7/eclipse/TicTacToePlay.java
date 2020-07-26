package org.Practice7_7.eclipse;
import java.util.Scanner;
public class TicTacToePlay {

	public static void main(String[] args) {
			
	    	int terminate=1;
	    	
	    	while(terminate==1) {
	    		System.out.println("Start the game...\n");
	    		TicTacToe game = new TicTacToe();
	    		
	    		
	        	game.addMove();
	        	
	        	game.sayWinner();
	        	
	        	System.out.print("Continue(-1:end / 1:continue)?");
	        	Scanner keyboard=new Scanner(System.in);
	        	terminate=keyboard.nextInt();
	        	
	        	if(terminate==-1) {
	        		System.out.println("game terminate...\n");
	        		break;
	        	}
	        	else if(terminate==1) {
	        		System.out.println("game reinitialize...\n");
	        		game.reInitializeGame();
	        		continue;
	        	}
	    	}
	   }

}


