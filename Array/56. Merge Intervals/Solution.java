class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> results = new ArrayList<>();
        int[] new_interval = intervals[0];
        results.add(new_interval);
        for(int[] interval:intervals){
            if(new_interval[1]>=interval[0]){
                new_interval[1]=Math.max(new_interval[1],interval[1]);
                
                
            }else{
                new_interval = interval;
                results.add(new_interval);
            }            
            
        }
        
        
        return results.toArray(new int[results.size()][2]);
    }
}