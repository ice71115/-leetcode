class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums)set.add(num);
        int longest =0;
        for(int num:nums){
            if(longest>set.size())break;
            set.remove(num);
            int left=num-1;
            int right=num+1;
            while(set.remove(left))left--;
            while(set.remove(right))right++;
            longest=Math.max(longest,right-left-1);
        }
        
        return longest;
    }
}