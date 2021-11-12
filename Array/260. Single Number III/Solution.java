class Solution {
    public int[] singleNumber(int[] nums) {

        int numsXor=0;
        for(int num:nums){
            numsXor^=num;
        }
        int k= (numsXor &-numsXor);
        int x=0;
        for(int num:nums){
            if((k & num) ==0){
                x^=num;    
            }
        }

        return new int[] {x,numsXor^x};
    }
}