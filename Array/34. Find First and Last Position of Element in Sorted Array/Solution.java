class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i!=0){
                    if(nums[i-1]==target){i--;}
                    else{break;}
                }
                while(j!=nums.length-1){
                    if(nums[j+1]==target){j++;}
                    else{break;}
                }
                return new int[]{i,j};
                
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}