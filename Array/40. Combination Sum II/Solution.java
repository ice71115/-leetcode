class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(candidates);
        
        combSum2(candidates,0,target,new ArrayList<>(),results);
        return results;
        
    }
    private void combSum2(int[] candidates , int x , int target,List<Integer> currList,List<List<Integer>> results){
        int start=x;
        while(x<candidates.length){
            if(x>start && candidates[x]==candidates[x-1]){x++;continue;}
            if((target-candidates[x])>0){
                List<Integer> list=new ArrayList<>(currList);
                list.add(candidates[x]);
                
                combSum2(candidates,x+1,target-candidates[x],list,results);
                
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

