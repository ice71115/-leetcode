class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE,closest=0;
		for(int i = 0 ;i<nums.length;i++) {
			if(i!=0 && nums[i]== nums[i-1]){
                continue;
            }
			//2sum
			
            int diff=target-nums[i];
			int l=i+1,r=nums.length-1;
			while(l<r) {
				int sum = nums[l]+nums[r];
				if(minDiff>Math.abs(diff-sum)) {
					minDiff=Math.abs(diff-sum);
                    
                    closest=sum+nums[i];
                
                }
                if(diff==sum){break;}
                //重複跳過
				else if(diff>sum) {l++;while(l<r && nums[l]==nums[l-1] ) {l++;}}
				else if(diff<sum) {r--;while(l<r && nums[r]==nums[r+1] ) {r--;}}					
					
				
				
				
				
				
			}
			
			
			
		}
		return closest;
    }
}