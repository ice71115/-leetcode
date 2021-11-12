class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j]==1)
                    switch(numofNeighbors(board,i,j)){
                        case 2:
                        case 3:
                            board[i][j]=3;
                        default:
                    }
                if(board[i][j]==0 && numofNeighbors(board,i,j)==3)
                    board[i][j]=2;
        }
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                board[i][j]=board[i][j]>>1;
            }
        
    }
    public int numofNeighbors(int[][] board,int i,int j){
        
        int count=0;
        for(int t=0;t<9;t++){
            int newi=i-1+t/3;
            int newj=j-1+t%3;
            if(newi<0 || newj<0) continue;
            if(newi>=board.length || newj>=board[0].length) continue;
            if(newi==i && newj==j) continue;
            if((board[newi][newj]&1)==1){
                count++;
            }
        }
        return count;        
        
    } 
}