class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,maxWater=0;
        while(i<j){
            maxWater=(maxWater<Math.min(height[i],height[j])*(j-i))?
                Math.min(height[i],height[j])*(j-i):maxWater;
            int l= height[i],r = height[j];
            
            if(height[i]<height[j]){
                
                while(i<j && height[i]<=l){++i;}
            }else{
                while(i<j && height[j]<=r){--j;}
            }
            
        }
        return maxWater;
    }
}