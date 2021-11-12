class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int minLen=nums.length+1;
        while(r<nums.length){

            sum+=nums[r++];
            while(target<=sum) {

                minLen=Math.min(minLen,r-l);
                sum-=nums[l++];
            }


            
        }
        return (minLen==nums.length+1)?0:minLen;
    }
}