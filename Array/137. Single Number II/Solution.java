class Solution {
    public int singleNumber(int[] nums) {

    
        int one=0; 
        int two=0;
        int three=0;
        for(int num:nums){
            //put num into one . if one contains num then put num into two
            two |= one & num;        
            //clear one
            one^=num;
            // if one and two contain num,put into three
            three=one&two;
            //clear one and two
            one&=~three;
            two&=~three;

        }    
        return one;
    
    }
}