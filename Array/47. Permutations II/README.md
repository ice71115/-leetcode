# 思路: 
## 與46. Permutations相似，需要多加入visited 的boolean array 讓已經加入的第i個元素不會重複加入，
## 還有 if((i>0 && nums[i]==nums[i-1]) && visited[i-1]) {continue;}可以避免重複的情況發生。

# 結果:
## Runtime: 1 ms
## Memory Usage: 39.9 MB