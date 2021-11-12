class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
        
                if(board[i][j]==word.charAt(0)){
                    
                    if(dfs(board,new boolean[board.length][board[0].length],word,1,i,j)){
                        return true;
                    }
                }
            }
        return false;
    }
    private boolean dfs(char[][] board,boolean[][] visited,String word,int wi,int i, int j){
        
        if(wi==word.length()){
            return true;
        }
        
        visited[i][j]=true;    
        if(i-1>=0 && (board[i-1][j]==word.charAt(wi)) && !visited[i-1][j]){
            if(dfs(board,visited,word,wi+1,i-1,j)){return true;}
        }
        if(i+1<board.length && (board[i+1][j]==word.charAt(wi))&& !visited[i+1][j]){
            if(dfs(board,visited,word,wi+1,i+1,j)){return true;}
        }
        if(j-1>=0 && (board[i][j-1]==word.charAt(wi))&& !visited[i][j-1]){
            if(dfs(board,visited,word,wi+1,i,j-1)){return true;}
        }

        if(j+1<board[0].length && (board[i][j+1]==word.charAt(wi))&& !visited[i][j+1]){
            if(dfs(board,visited,word,wi+1,i,j+1)){return true;}
        }
        
        visited[i][j]=false; 
        return false;
    }
}