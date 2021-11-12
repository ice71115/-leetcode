# 思路: 
## 使用dp dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1; 
# 結果:
##Runtime: 4 ms, faster than 89.43% of Java online submissions for Maximal Square.
##Memory Usage: 42.1 MB, less than 69.29% of Java online submissions for Maximal Square.