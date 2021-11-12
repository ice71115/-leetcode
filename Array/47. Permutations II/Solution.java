class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> permuteUnique(int[] nums) {
    
        results = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        insertNum(new ArrayList<>(),nums,visited);
        return results;
        
    }
    private void insertNum(List<Integer> list, int[] nums,boolean[] visited){
        if(list.size()==nums.length ){
            results.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if (visited[i] ) {continue;}
            if((i>0 && nums[i]==nums[i-1]) && visited[i-1]) {continue;}
            visited[i]=true;
            list.add(nums[i]);
            insertNum(list,nums,visited);
            list.remove(list.size()-1);
            visited[i]=false;
            
        }
        
        
        
    }
}