class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]==target){return start;}
            
            if(nums[mid]==target){return mid;}
            if(nums[start]==nums[mid]){
                start++;
            }else if(nums[start]<nums[mid]){
                if(nums[mid]>target && nums[start]<target){
                    start++;
                    mid--;
                }else{
                    start=mid+1;
                }
                
            }else{
                if(nums[mid]<target && nums[start]>target){
                    start=mid+1;
                    
                }else{
                    end=mid-1;
                }
                
            }
            
        }
        return -1;
    }
}