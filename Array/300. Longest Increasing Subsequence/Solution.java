class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int longest=0;
        for(int num:nums){
            int i =Arrays.binarySearch(dp,0,longest,num);
            if(i<0)i=-(i+1);
            dp[i]=num;
            if(i==longest)longest++; 
        }
        return longest;
    }
}