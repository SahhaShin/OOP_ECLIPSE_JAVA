package org.Practice7_7.eclipse;
import java.util.Scanner;
public class TicTacToe {
	
	private final static int ROWS = 3;
    private final static int COLUMNS = 3;
    private char[][] gameBoard;
    private char player1 = 'X', player2 = 'O';
    private boolean playerX = true;
    private int player1Win = 0;
    private int player2Win = 0; 
    

    Scanner in = new Scanner(System.in);
    
    //초기화
    public TicTacToe()
    {
        gameBoard  = new char [ROWS][COLUMNS];
        playerX = true;
        
        reInitializeGame();
    }


    //method1
    public void addMove()
    {
        int row, col;
        do
        {
        turn();
        System.out.print("Please Enter a row (1-3): ");
        row = in.nextInt() - 1; 
        System.out.print("Please Enter a column (1-3): ");
        col = in.nextInt() - 1;

        if(notValid(row,col)){
            
            System.out.println("Invalid!!!\n");
            continue;
        }

        if (row>=0 && row<ROWS)
            if(col>=0 && col<COLUMNS)
                if (playerX)
                    {
                        gameBoard[row][col] = player1;
                        displayBoard();
                    }
                    else 
                    {
                        gameBoard[row][col] = player2;
                        displayBoard();
                    }
         boolean won =Winner();
         if(won)
         {
             System.out.println("Game End\n");
             if(playerX)
             {
                 player1Win++;          
             }
             else
             {
                 player2Win++;
             }
             break;
         }
         changePlayer();
        }while (true);
    }
    
    
    //method2
    public void displayBoard()
    {
    	System.out.print("\n-----\n");
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLUMNS; col++)
            {        
                System.out.print("" + gameBoard[row][col]);
                if(col == 0 || col == 1)
                    System.out.print("|");

            }
            if (row ==0 || row ==1)
            System.out.print("\n-----\n");
        }
        System.out.print("\n-----\n");
        System.out.print("\n\n");
    }
    
    
    //method3
    public boolean turn()
    {
        if (playerX)
        {
            System.out.println("Player X turn");
        }
        else
        {
            System.out.println("Player O turn");
        }
        return playerX;
    }
    
    //method4
    public boolean Winner()
    {
        //행체크
        for(int row = 0; row < ROWS; row ++)
        {
            if (gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1]==gameBoard[row][2] && gameBoard[row][0]!= ' ')
            return true;    
        }       
        //열체크
        for (int col = 0;  col < COLUMNS; col++)
        {   
            if (gameBoard[0][col] == gameBoard[1][col]&& gameBoard[1][col]==gameBoard[2][col] && gameBoard[0][col]!= ' ')
            return true;
        }
        //대각선체크
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0]!= ' ')
            return true;
        if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2] && gameBoard[0][2]!= ' ')
            return true;

        return false; 
    }
    //method5
    public void sayWinner() {
    	if(player1Win==1) {
    		System.out.println("\nplayerX win!!!\n");
    	}
    	else {
    		System.out.println("\nplayerO win!!!\n");
    	}
    }
    
    //method6
    public void reInitializeGame()
    {
        for (int row = 0; row < ROWS; row++)
            for(int col = 0; col < COLUMNS; col++)
                gameBoard[row][col]= ' ';
        player1Win = 0;
        player2Win = 0;
    }

    

    public boolean notValid(int row, int col)
    {
        if (row < 0 || row > (ROWS - 1))
            return true;
        if (col < 0 || col > (COLUMNS - 1))
            return true;
        if (!isEmpty(row,col))
            return true;
        return false;
    }
    
    //이미 누가 체크하진 않았는지
    public boolean isEmpty(int row, int col)
    {
        if(gameBoard[row][col]==' ')
            return true;
        else
        {
            System.out.println("\nAlready checked\n");
            return false;
        }
    }
    
    //o가 끝나면 x
    public void changePlayer()
    {
        if (playerX)
        {
            playerX = false;
        }
        else
        {
            playerX = true;
        }
    }
    
   
  

}
