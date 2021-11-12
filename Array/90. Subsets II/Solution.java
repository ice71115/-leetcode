class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        dfs(results,new ArrayList<>(),nums,0);
        return results;
        
    }
    private void dfs(List<List<Integer>> results, List<Integer> list,int[] nums,int ni){
        results.add(new ArrayList<>(list));
        
        for(int i=0;i<nums.length;i++){
            if(i>=ni){
                if(i>ni && nums[i]==nums[i-1])continue;
                list.add(nums[i]);
                dfs(results,list,nums,i+1);
                list.remove(list.size()-1);
            }
            
        }
    
    }
}