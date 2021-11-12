class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] visited = new boolean[n][m];
        List<Integer> results = new ArrayList<>();
        int i=0,j=0;
        //direction >:1 V:2 <:-1 ^:-2
        int direction=1;
        while(results.size()<m*n){
            
            
            int new_i=i+direction/2;
            int new_j=j+direction%2;
            if(((new_i>=n || new_j>=m)|| (new_i<0 || new_j<0)) ||visited[new_i][new_j]){
                switch(direction){
                    case 1:
                        direction=2;
                        break;
                    case 2:
                        direction=-1;
                        break;
                    case -1:
                        direction=-2;
                        break;
                    case -2:
                        direction=1;
                }
                new_i=i+direction/2;
                new_j=j+direction%2;
            }

            visited[i][j]=true;
            results.add(matrix[i][j]);
            i=new_i;
            j=new_j;
            

            
            
        }
        
        
        return results;
    }
}