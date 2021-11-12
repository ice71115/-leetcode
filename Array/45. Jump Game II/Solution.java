class Solution {
    public int jump(int[] nums) {
        int longest=0,lastLongest=0,minStep=0;
        for(int i =0;i<nums.length;i++){
            if(i>lastLongest){
                ++minStep;
                lastLongest=longest;
                
            }
            longest=(i+nums[i]>longest)?i+nums[i]:longest;
            
            
        }
        return minStep;
    }

}