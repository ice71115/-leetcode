class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<>();

        int[] count = new int[2];
        int[] n = new int[2];
        
        for(int num:nums){
            if(num==n[0]){
                count[0]++;                
            }else if(num==n[1]){
                count[1]++;
            }else if(count[0]==0){
                count[0]=1;
                n[0]=num;
            }else if(count[1]==0){
                count[1]=1;
                n[1]=num;
            }else{
                count[0]--;
                count[1]--;
            }
        }
        count = new int[2];
        for(int num:nums){
            if(num==n[0])count[0]++;
            if(num==n[1])count[1]++;
        }
        if(count[0]>nums.length/3) 
            ans.add(n[0]);   
        if(count[1]>nums.length/3 && n[0]!=n[1]) 
            ans.add(n[1]);
        return ans;
        
    }
}