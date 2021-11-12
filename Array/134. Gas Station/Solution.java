class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int max=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
        for(int i=gas.length-1;i>=0;i--){
            sum+=gas[i]-cost[i];
            if(sum>max){
                max=sum;
                j=i;
            }
            
        }
        if(sum<0)
            return -1;
        return j;
    }
}