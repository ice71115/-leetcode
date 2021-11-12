class Solution {
    public boolean canJump(int[] nums) {
        int longest=0;
        for(int curr=0;curr<nums.length;curr++){
            if(longest<curr+nums[curr]){
                longest=curr+nums[curr];
            }
            if(longest<=curr && curr!=nums.length-1){return false;}

        }   
        return true;
    }
}