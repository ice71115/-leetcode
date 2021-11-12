class Solution {
    List<String> ret = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs("(",1,0,n);
        return ret;
    }
    private void dfs(String s,int numLeft,int numRight,int n){
        if(numLeft==n){
            while(numRight<n){
                s+=")";
                numRight++;
            }
            ret.add(s);           
            return;
        }
        
        if(numLeft<n){
            dfs(s+"(",numLeft+1,numRight,n);
        }
        if(numLeft>numRight){
            dfs(s+")",numLeft,numRight+1,n);
        }
            
        
        
        
    }
}