class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2 .equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] ans = new int[n1+n2-1];
        int prod = 0;
        for(int i = 0 ;i<n1;i++)
            for(int j = 0 ;j<n2;j++){
                 ans[n1+n2-i-j-2]+= (num2.charAt(j)-'0') * (num1.charAt(i)-'0');
                
            }
        for(int i =0;i<ans.length-1;i++){
            if(ans[i]/10 != 0){
                ans[i+1]+=ans[i]/10;
                ans[i]=ans[i]%10;
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i = ans.length-1 ;i>=0;i--){
            sb.append(String.valueOf(ans[i]));
        }
        return sb.toString();
    }
}