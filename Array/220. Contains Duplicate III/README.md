# 思路: 
## 使用treeset 的floor ceiling 
# 結果:
## Runtime: 30 ms, faster than 74.96% of Java online submissions for Contains Duplicate III.
## Memory Usage: 40.4 MB, less than 95.97% of Java online submissions for Contains Duplicate III

# 其他方法
## 還有另一種方法是使用bucket，0~t-1 為一桶、t~2t-1一桶，以此類推，再每個元素一一檢查(HashMap)。