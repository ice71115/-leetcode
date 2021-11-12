class Solution {
    public String intToRoman(int num) {
        StringBuilder ret = new StringBuilder();
        int[] n = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        while(num>0){
            while( num>=n[i] ){
                num-=n[i];
                ret.append(s[i]);
            }
            i++;
        }
        return ret.toString();
    }
}