class Solution {
    
    static int N=9;
    public boolean isValid(char[][] board, int row , int col){
        if(row==N-1 && col==N) return true; 

        if(col==N){
            row++;
            col=0;
        }

        if(board[row][col]!='.')
            return isValid(board,row,col+1);

        for(char num='1';num<='9';num++){
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                if(isValid(board,row,col+1)){
                    return true;
                }
            }
            board[row][col] = '.';
        }   
        return false;
    }


    public boolean isSafe(char[][] board,int row, int col, char num){
        
        for(int i=0;i<=8;i++){
            if(board[row][i]==num){
                return false;
            }
            if(board[i][col]==num){
                return false;
            }
        }

        int thRow = row-row%3;
        int thCol = col-col%3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+thRow][j+thCol] == num)
                    return false;
            }
        }

        return true;


    }
    public void solveSudoku(char[][] board) {
        isValid(board,0,0);
    }
}
