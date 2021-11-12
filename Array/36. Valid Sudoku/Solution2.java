class Solution {
    public boolean isValidSudoku(char[][] board) {
		int w = 9;
        for (int i = 0; i < w; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
		    for (int j = 0 ; j < w; j++){
                //第i個列
                if(board[i][j]!='.' && !row.add(board[i][j])){
                    return false;
                }
                //第i個行
                if(board[j][i]!='.' && !column.add(board[j][i])){
                    return false;
                }
                //第i個cude
                int x=i%3*3;
                int y=i/3*3;
                if(board[x+j%3][y+j/3]!='.' && !cube.add(board[x+j%3][y+j/3])){
                    return false;
                }
                
                
                
            }
        }
		return true;
	}
}