class Solution {
    public int maxProduct(int[] nums) {
        int l=0;
        int r=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            l=(l==0?1:l)*nums[i];
            r=(r==0?1:r)*nums[nums.length-1-i];
            max=Math.max(max,Math.max(l,r));
        }
        return max;
    }
}