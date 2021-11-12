public class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]=='0') continue;
                if(i==0 || j==0){
                    if(matrix[i][j]=='1'){
                        dp[i][j]=1;
                        max=Math.max(max,1);
                    }
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}