class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> permute(int[] nums) {
        
        results = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        insertNum(new ArrayList<Integer>(),nums);
        return results;
        
    }
    private void insertNum(List<Integer> list, int[] nums){
        if(list.size()==nums.length){
            results.add(new ArrayList<Integer>(list));
            return;
        }
        
        
        for(int num:nums){
            if (!list.contains(num)) {
                list.add(num);
                insertNum(list,nums);
                list.remove(list.size()-1);
            }
        }
        
        
        
    }
}