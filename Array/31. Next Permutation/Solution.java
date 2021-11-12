class Solution {
    public void nextPermutation(int[] nums) {
        for(int i = nums.length-2;i>=0;i--){
            
            if(nums[i]<nums[i+1] ){


                int p=i+1;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]>nums[i] ){
                        p=j;
                    }   
                }
                swap(nums,p,i);
                reverse(nums,i+1,nums.length-1);
                return;
            }
        }
        reverse(nums,0,nums.length-1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right)
            swap(nums, left++, right--);
    }
    
}