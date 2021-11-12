# 思路: 
## O(m+n)的空間可以簡單的解決這個問題，但題目要求我們使用O(1)的空間，
## 因此我們使用matrix的第一個row column 與 fc fr 做緩存，來更新matrix
# 結果:
##Runtime: 1 ms, faster than 94.02% of Java online submissions for Set Matrix Zeroes.
##Memory Usage: 40.4 MB, less than 83.38% of Java online submissions for Set Matrix Zeroes.