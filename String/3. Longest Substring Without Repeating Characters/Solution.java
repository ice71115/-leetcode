class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len<=1) return len;
        HashMap<Character,Integer> map= new HashMap<>();
        int longest=0;
        int start=0;
        for(int i=0,temp=0;i<len;i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                temp++;
            }else{
                start=Math.max(map.get(s.charAt(i)),start);
                temp=i-start;
                map.put(s.charAt(i),i);
            }
            longest=Math.max(temp,longest);
        }
        return longest;
    }
}