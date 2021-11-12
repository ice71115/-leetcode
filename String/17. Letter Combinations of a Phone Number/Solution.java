class Solution {
    List<String> results =new ArrayList<>();
    String d;
    String[] mapping;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return results;
        d=digits;
        mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(new StringBuilder(),0);
        
        return results;
    }
    private void dfs(StringBuilder ret,int x){
        if(x>=d.length()){
            results.add((new StringBuilder(ret)).toString());
            return;
        }
        int index=Character.getNumericValue(d.charAt(x));
        String s=mapping[index];
        for(int j=0;j<s.length();j++){
                ret.append(s.charAt(j));   
                dfs(ret,x+1);
                ret.deleteCharAt(ret.length()-1);
        }
    }
}