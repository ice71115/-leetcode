class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        combSum(candidates,0,target,new ArrayList<>(),results);
        return results;
    }
    private void combSum(int[] candidates,int x, int target, List<Integer> currList, List<List<Integer>> results){
        while(x<candidates.length){
            if((target-candidates[x])>0){
                List<Integer> list=new ArrayList<>(currList);
                list.add(candidates[x]);
                combSum(candidates,x,target-candidates[x],list,results);
                
            //find
            }else if(target==candidates[x]){
                
                currList.add(candidates[x]);
                results.add(new ArrayList<>(currList));

                break;
            }
            x++;
            
            
        }

        return;
        
    }
}