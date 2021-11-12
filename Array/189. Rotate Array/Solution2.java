class Solution {
    public void rotate(int[] nums, int k) {
    int m=nums.length;
        k %= m;
    reverse(nums, 0, m-1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, m-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start<end){ 
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}