class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=1;i<=n;i++){
            if(citations[n-i]<i)
            return i-1;
        }

        return n;
    }
}