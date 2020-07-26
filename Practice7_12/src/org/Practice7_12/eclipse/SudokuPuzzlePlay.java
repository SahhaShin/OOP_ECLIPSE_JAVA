package org.Practice7_12.eclipse;
import java.util.Scanner;
public class SudokuPuzzlePlay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        System.out.println("Start the Game!!!\n");
        

        System.out.println("create puzzle...\n");
        SudokuPuzzle puzzle = new SudokuPuzzle();
        
        System.out.println("initialize Puzzle...\n");
        puzzle.initializePuzzle(puzzle);
        System.out.println("-----------------------------------------\n");
        
        System.out.print("> Initialize puzzle\n\n" + puzzle);

        System.out.println("\n-----------------------------------------\n");
        
        boolean terminate = false;
        while(!terminate){
            System.out.print("What do you want?\n->0(Terminate) / ->1(Clear) / ->2(Input number) / ->3(get Allow number) : ");
            int response = keyboard.nextInt();

            if(response==0){
                System.out.println("\n> Terminate...\n");
                terminate = true;
                continue;
            } 
            
            else if(response==2){
            	System.out.println("Start Input number...");
                System.out.print("Please Enter a row: ");
                int row = keyboard.nextInt()-1;
                System.out.print("Please Enter a col: ");
                int col = keyboard.nextInt()-1;
                System.out.print("Please Enter a value (1-9): ");
                int value = keyboard.nextInt();
                puzzle.addGuess(row, col, value);
            } 
            
            else if(response==3){
                System.out.println("Start get Allow number...");
                System.out.print("Please Enter a row: ");
                int row = keyboard.nextInt()-1;
                System.out.print("Please Enter a col: ");
                int col = keyboard.nextInt()-1;

                boolean valid[] = puzzle.getAllowedValues(row, col);

                System.out.print("\n* Allowed value : ");
                for(int i=0; i<9; i++){
                    if(valid[i])
                        System.out.print((i+1)+ "  ");
                }
                System.out.print("*\n");

            } 
            
            else if(response==1){
                puzzle.reset();
            }
            
            else {
            	System.out.println("\n> Error!!! : Please Enter 0~3\n");
            }

            System.out.println("-----------------------------------------\n");
            System.out.print("> Now Puzzle \n\n" + puzzle);
            
            
            if(!puzzle.checkPuzzle()) {
                System.out.println("\n> Not allow number - ^ - ...");
                System.out.println("\n-----------------------------------------\n");
            }
            else if(puzzle.isFull()) {
                System.out.println("\n> SudokuPuzzle Full!!!");
                System.out.println("\n-----------------------------------------\n");
            }
            else {
            	System.out.println("\n-----------------------------------------\n");
            }

        }

	}

}
