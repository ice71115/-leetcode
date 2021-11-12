class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        for(int i=0;i<matrix.length;i++){
            if(target<matrix[i][matrix[0].length-1]){
                return BinarySearch(matrix[i],target);
            }else if(target==matrix[i][matrix[0].length-1]) return true;
        }
        return false;
    }
    private boolean BinarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        
        while(start<=end){

            int mid = (start+end)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }
            
        }
        return false;
    }
}