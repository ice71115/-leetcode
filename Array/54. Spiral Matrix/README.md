# 思路: 
## i j 表array 位置，direction 為方向，visited[i][j] 表示matrix[i][j] 是否被拜訪過，
## 主要想法是控制方向，依序將matrix 元素加入到results中 
# 結果:
## Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
## Memory Usage: 37.1 MB, less than 73.24% of Java online submissions for Spiral Matrix.

# 其他想法
## 將array拆成上右下左填入results中，再將中間當作新的array 以同樣的方式填入results中