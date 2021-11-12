class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=2;i<=n;i++){
            ans=helper(ans);
        }
        return ans;
    }
    private String helper(String s){
        StringBuilder sb = new StringBuilder();
        char last_a='i';
        int count=1;
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if(last_a=='i'){
                last_a=a;
                
            }else
            if(last_a!=a){
                sb.append(String.valueOf(count));
                sb.append(String.valueOf(last_a));
                count=1;
                last_a=a;
            }else
            if(last_a==a){
                count++;
            }
            
        }
        sb.append(String.valueOf(count));
        sb.append(String.valueOf(last_a));
        return sb.toString();
    }
}