class SudokoSolver{

    public void Solve(char[][] board,int row,int col){
        if(row==9){

        }
        else{
            if(col==9){
                Solve(board, row+1, 0);
            }
            if(board[row][col] >='0' && board[row][col]<='9'){
                Solve(board, row, col+1);
            }
            else{
                
                for(int i=1;i<=9;i++){
                    if(isSafe()==true){
                        board[row][col] =(char)(i+48);
                        Solve(board, row, col+1);
                        board[row][col] =0;
                    }
                }
            }
        }
    }
public boolean isSafe(char[][] board,int row,int col){
    for(int i = 0;i<9;i++){
        if(board[row][i] == (char))
    }
}
    public void  solveSudoku(char[][] board){

    }
    public static void main(String[] args) {
        
    }
}