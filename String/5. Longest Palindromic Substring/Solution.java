class Solution {
    int start=0;
    int maxLen=0;
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        for(int i=1;i<n;i++){
            Palindromic(s,i-1,i-1);
            if(s.charAt(i-1)==s.charAt(i)){
                Palindromic(s,i-1,i);
            }
        }
        return s.substring(start,start+maxLen);        
        
    }
    private void Palindromic(String s,int left,int right){
        int n = s.length();
        int len=1;
        if(left!=right) len=2;
        
        while((left>0 && right<n-1)&& (s.charAt(left-1)==s.charAt(right+1))){
            len+=2;
            left--;
            right++;
        }
        if(maxLen<len){
            start=left;
            maxLen=len;
        }        
    }
}