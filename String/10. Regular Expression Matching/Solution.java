class Solution {
    public boolean isMatch(String s, String p) {
        int n = p.length();

        if(p.isEmpty() ) return s.isEmpty();
        
        boolean first= (!s.isEmpty())&&(p.charAt(0)==s.charAt(0) || p.charAt(0)=='.');
        if(n>=2 && p.charAt(1)=='*'){
                return  (first &&isMatch(s.substring(1),p)) || isMatch(s,p.substring(2));
        }else{
            return first &&isMatch(s.substring(1),p.substring(1));
        }
        
        
    }
}