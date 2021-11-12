class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        return Math.max(rob1(nums,0,nums.length-2),rob1(nums,1,nums.length-1));
    }
    public int rob1(int[] nums,int start,int end) {
        int a=0;
        int b=0;
        for(int i=start;i<=end;i++){
            int temp=a;
            a=Math.max(b+nums[i],a);
            b=temp;
        }
        return a;
        
    }
}