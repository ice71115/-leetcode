# 思路: 
## 首先紀錄紀錄每個位置最遠可以走到的距離，也就是只走一步可走到的最遠距離，
## 等到超過第一步的最遠距離，在更新第二步可以走到的最遠距離，以此類推，
## 就可以知道走到第nums.length-1需要幾步。
# 結果:
## Runtime: 1 ms, faster than 79.35% of Java online submissions for Jump Game II.
## Memory Usage: 39.9 MB, less than 35.67% of Java online submissions for Jump Game II.