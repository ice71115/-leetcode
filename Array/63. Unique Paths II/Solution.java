class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] dp = new int[obstacleGrid[0].length];
        dp[0]=1;
        for(int[] row:obstacleGrid)
            for(int i=0 ;i<row.length;i++){
                if(row[i]==1){
                    dp[i]=0;    
                }else if(i>0){
                    dp[i]+=dp[i-1];
                }
            }
        return dp[obstacleGrid[0].length-1];
    }
}