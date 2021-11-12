class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,i,left++);
            }else if(nums[i]==2){
                swap(nums,i--,right--);
            }
            i++;
            
        }
    }
    private void swap(int[] nums,int a,int b){
        if(a==b)return;
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
    }
}