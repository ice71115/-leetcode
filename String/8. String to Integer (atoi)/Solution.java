class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        
            int sign=1;
            int num=0;
        boolean existSign=false;
        boolean existNum=false;
        for(int i=0;
            i<n;i++){
            int t=(int)s.charAt(i);
            if(t==32){
                if(existNum) return num;
                if(existSign)return 0;
                continue;
            }
            if(t==43 || t==45){
                if(!existSign){
                    sign=(t==45)?-1:1;
                    existSign=true;
                }else if(existNum){
                    return num;
                }else
                    return 0;
                
            }else if(48<=t && t<=57){
                int old=num;
                num*=10;
                num+=(t-48)*sign;
                if(old>0 && old>num/10)return Integer.MAX_VALUE;
                if(old<0 && old<num/10)return Integer.MIN_VALUE;
                existNum=true;
                existSign=true;

            }else{
                if(existNum) return num;
                return 0;                
                
            }
            
            
        }
        
        return num;
    }
}