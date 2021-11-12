class Solution {
    public String convert(String s, int numRows) {
        
        int n =s.length();
        if(n<=numRows || numRows==1) return s;
        StringBuilder ret = new StringBuilder();
        int v = numRows*2 -2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<n;j+=v){
                ret.append(s.charAt(j));
                if((i!=0 && i!=numRows-1) && j+v-2*i<n){
                    ret.append(s.charAt(j+v-2*i));
                }
                
            }
        }
        return ret.toString();
    }
}