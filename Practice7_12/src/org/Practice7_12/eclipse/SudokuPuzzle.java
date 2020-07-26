package org.Practice7_12.eclipse;

public class SudokuPuzzle {
	
	private int board[][];
    private int start[][];


    //method1. create empty puzzle, 0으로 초기화
    public SudokuPuzzle(){
        start = new int[9][9];
        board = new int[9][9];
    }

    //method2. SudokuPuzzle outline
    public String toString(){
        String outline = "   1  2  3  4  5  6  7  8  9\n";
        outline = outline + "  ----------------------------\n";
        for(int i=0; i<9; i++){
        	outline = outline + (i+1) + " |";
            for(int j=0; j<9; j++){
                if(board[i][j] == 0)
                	outline = outline + "  |";
                else
                	outline = outline + board[i][j] + " |";
            }
            outline = outline + "\n";
            outline = outline + "  ----------------------------\n";
        }
        return outline;
    }

    //method3. initial value - can't change(start)
    public void addInitial(int row, int col, int value){
        if(row>=0 && row<=9 && col>=0 && col<=9 && value>=1 && value<=9){
            start[row][col] = value;
            board[row][col] = value;
        }
    }

    //method4. value - can change(board)
    public void addGuess(int row, int col, int value){
        if(row>=0 && row<=9 && col>=0 && col<=9 && value>=1 && value<=9 && start[row][col] == 0){
            board[row][col] = value;
        }
    }

    
    //method5. returns true if the values in the puzzle 
    public boolean checkPuzzle(){
        boolean result = true;
        // See if the values in the squares are legal;
        for(int i=0; i<9; i++){
        	result = result && checkRow(i);
        	result = result && checkCol(i);
        	result = result && check_3x3(i);

        }
        return result;
    }

    
    
    //method5-1 check row
    public boolean checkRow(int row){
        
        int count[] = new int[10];
        for(int col=0; col<9; col++){
            count[board[row][col]]++;
        }

        boolean check_row = true;
        for(int i=1; i<=9; i++)
        	check_row = check_row && (count[i]<=1);

        return check_row;
    }
    
    //method5-2 check COL
    public boolean checkCol(int col){
        int count[] = new int[10];
        for(int row=0; row<9; row++){
            count[board[row][col]]++;
        }

        boolean check_col = true;
        for(int i=1; i<=9; i++)
        	check_col = check_col && (count[i]<=1);

        return check_col;
    }
    
    
    //method5-3 check 3x3
    public boolean check_3x3(int sub){
     
        int count[] = new int[10];

        int row_3x3 = (sub/3) *3;
        int col_3x3 = (sub%3) *3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                count[board[row_3x3+i][col_3x3+j]]++;
            }
        }

        boolean check_3x3 = true;
        for(int i=1; i<=9; i++)
        	check_3x3 = check_3x3 && (count[i]<=1);

        return check_3x3;
    }
    
    //method6. returns the value in the given square 
    public int getValueIn(int row, int col){
        return board[row][col];
    }
    
    //method7. 칸에 들어 갈 수 있는 숫자들만 보여준다.
    public boolean[] getAllowedValues(int row, int col){
        
        int temp = board[row][col];
        boolean result[] = new boolean[9];

        for(int i = 1; i <=9; i++){
            board[row][col] = i;
            result[i-1] = checkPuzzle();
        }

        board[row][col] = temp;

        return result;
    }
    
    //method8. 스도쿠가 다찼음
    public boolean isFull(){
        boolean full = true;
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
            	full = full && board[i][j]>0;

        return full;
    }
    
    //method9. board->start
    public void reset(){
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                board[i][j] = start[i][j];
    }

    

    //이미 넣어져 있는 숫자들
    public static void initializePuzzle(SudokuPuzzle puzzle){
    	puzzle.addInitial(0,0,1);
    	puzzle.addInitial(0,1,2);
    	puzzle.addInitial(0,2,3);
    	puzzle.addInitial(0,3,4);
    	puzzle.addInitial(0,4,9);
    	puzzle.addInitial(0,5,7);
    	puzzle.addInitial(0,6,8);
    	puzzle.addInitial(0,7,6);
    	puzzle.addInitial(0,8,5);
    	puzzle.addInitial(1,0,4);
    	puzzle.addInitial(1,1,5);
    	puzzle.addInitial(1,2,9);
    	puzzle.addInitial(2,0,6);
    	puzzle.addInitial(2,1,7);
    	puzzle.addInitial(2,2,8);
        puzzle.addInitial(3,0,3);
        puzzle.addInitial(3,4,1);
        puzzle.addInitial(4,0,2);
        puzzle.addInitial(5,0,9);
        puzzle.addInitial(5,5,5);
        puzzle.addInitial(6,0,8);
        puzzle.addInitial(7,0,7);
        puzzle.addInitial(8,0,5);
        puzzle.addInitial(8,3,9);

    }

}
