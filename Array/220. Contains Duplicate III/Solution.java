class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        
        TreeSet<Long> tree= new TreeSet<>();
        
        for(int i=0;i<nums.length;i++){
            
            Long f = tree.floor((long)nums[i]+t);

            if((f!=null && f + t >= nums[i])){
                return true;
            }
            
            tree.add((long)nums[i]);    
            if(i>=k){
                tree.remove((long)nums[i-k]);
                
            }
        }
        return false;
        
        
    }
}