class Solution {
    public void rotate(int[] nums, int k) {
        int i = 0;
        int s =0;
        int j = 0;
        int m = nums.length;
        int n =k/m+1;
        for(int t=0;t<m-1;t++){

            j=(i-k+m*n) %m;
            if(s==j){
                i=(j+m-1)%m;
                s=i;
                
            }else{
                swap(nums,i,j);
                i=j;
            }
        }
    }    
    private void swap(int[] nums,int i,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}