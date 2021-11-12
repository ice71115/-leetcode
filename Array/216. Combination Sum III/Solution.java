class Solution {
    private List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList<>(),k,n,0,1);
        return results;
    }
    private void dfs(List<Integer> list,int k,int n,int sum,int curNum){
        if(n==sum && list.size()==k){
            results.add(new ArrayList<>(list));
            return;
        }
        
        
        for(int i=curNum;i<=9;i++){
            if(n>sum &&list.size()<k){
                list.add(i);
                dfs(list,k,n,sum+i,i+1);
                list.remove(list.size()-1);
            }
        }
        
    }
}