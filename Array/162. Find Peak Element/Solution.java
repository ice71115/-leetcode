class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(end-start>1){
            int mid= (start+end)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])return mid;
            else if(nums[mid]<nums[mid+1] && nums[mid]>nums[mid-1]){
                start=mid+1;
            }else if(nums[mid]>nums[mid+1] && nums[mid]<nums[mid-1]){
                end=mid-1;
            }else if(nums[mid]<nums[mid+1] && nums[mid]<nums[mid-1]){
                end=mid-1;
            }
        }
        if(end-start==1){
            if(nums[end]>nums[start])return end; 
            else return start;
        }
        return start;
    }
}