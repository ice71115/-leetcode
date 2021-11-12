class Solution {
    public boolean isValidSudoku(char[][] board) {
        int p=0;
        int w=9;
        char noNum= '.';
        for(int i =0 ;i<w ;i++){
            for(int j =0;j<w;j++){
                p=j+1;
                while(p<w){
                    if(board[i][p]==noNum){p++;continue;}
                    else if(board[i][p]==board[i][j]){
                        
                        return false;
                    }
                    p++;
                }
                p=i+1;
                while(p<w){
                    if(board[p][j]==noNum){p++;continue;}
                    else if(board[p][j]==board[i][j]){
                        
                        return false;
                    }
                    p++;
                }
                p=0;
                int x=(i/3)*3;
                int y=(j/3)*3;
                while(p<w){
                    if(board[x+p%(w/3)][y+p/(w/3)]==noNum){p++;continue;}
                    else if(board[x+p%(w/3)][y+p/(w/3)]==board[i][j]){
                        if(x+p%(w/3)!=i && y+p/(w/3)!=j)
                            return false;
                    }
                    p++;
                }
                
            }
            
        }
        return true;
    }
}