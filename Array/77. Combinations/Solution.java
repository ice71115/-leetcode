class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results= new ArrayList<List<Integer>>();
        
        combineHelper(results,new ArrayList<Integer>(),n,k,0);
        return results;
    }
    public void combineHelper(List<List<Integer>> results ,List<Integer> list,int n,int k,int num){
        if(k==0){
            results.add(new ArrayList<Integer>(list));

            return; 
        }
        num++;
        for(int i = num;i<=n;i++){

            list.add(i);
            combineHelper(results,list,n,k-1,i);
            list.remove(list.size()-1);
            
        }   
    }
}