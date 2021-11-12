class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid= (start+end)/2;
            
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[start]>nums[mid]){
                end=mid;
                start=start+1;
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }else if(nums[start]<nums[end]){
                return nums[start];
            }
            
        }
        return nums[start];
    }
}