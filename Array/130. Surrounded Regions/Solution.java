class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')
                dfs(board,i,0);
            if(board[i][n-1]=='O')
                dfs(board,i,n-1);
                
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O')
                dfs(board,0,j);
            if(board[m-1][j]=='O')
                dfs(board,m-1,j);
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='*')
                    board[i][j]='O';
            }
    }
    private void dfs(char[][] board,int i,int j){
        board[i][j]='*';
        
        if(i>0 &&board[i-1][j]=='O') dfs(board,i-1,j);
        if(i<board.length-1 && board[i+1][j]=='O') dfs(board,i+1,j);
        if(j>0 &&board[i][j-1]=='O') dfs(board,i,j-1);
        if(j<board[0].length-1 &&board[i][j+1]=='O') dfs(board,i,j+1);
    }

}