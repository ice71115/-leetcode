# 思路: 
## 先將所有num xor 會得到兩個數的xor，接下來將嘗試將這兩個數字拆開，兩數的xor中，bit為1表示，
## 兩數的這個bit不相同，因此我們找最右邊的bit，也就是 int k= (numsXor &-numsXor); ，
## 接著使用遮罩將num該bit以外的bit清0 if((k & num) ==0)，並將=0所有num xor ，就得到其中一個數。 
# 結果:
##Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number III.
##Memory Usage: 38.8 MB, less than 92.64% of Java online submissions for Single Number III.