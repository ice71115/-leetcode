class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
		List<List<Integer>> results =new ArrayList<>();
		for(int i = 0 ;i<nums.length;i++) {
			if(i!=0 && nums[i]== nums[i-1]){
                continue;
            }
			//2sum
			int target=-nums[i];
			int l=i+1,r=nums.length-1;
			while(l<r) {
				int sum = nums[l]+nums[r];
				if(target==sum ) {
					List<Integer> solution = Arrays.asList(nums[i],nums[l],nums[r]);
					results.add(solution);
					l++;
					r--;
					while(l<r && nums[l]==nums[l-1] ) {l++;}
					while(l<r && nums[r]==nums[r+1] ) {r--;}
				}
				else if(target>sum) {l++;}
				else if(target<sum) {r--;}					
					
				
				
				
				
				
			}
			
			
			
		}
		return results;
    }
}