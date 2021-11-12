# 思路: 
## 可以輕鬆找出時間複雜度O(n*n)的解法，但題目要求O(nlogn)，
## 想法是建立一個存放目前遞增子數列的dp，每個num加入都在dp內特定位置更新，當長度超過longest，
## 就執行longest++，直到加入所有的num。
# 結果:
##Runtime: 2 ms, faster than 99.08% of Java online submissions for Longest Increasing Subsequence.
##Memory Usage: 38.5 MB, less than 76.69% of Java online submissions for Longest Increasing Subsequence.