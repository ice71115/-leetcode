class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
		List<List<Integer>> results =new ArrayList<>();
		for(int i = 0 ;i<nums.length;i++) {
            if(i!=0 && nums[i]== nums[i-1]){
                    continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j]== nums[j-1]){
                    continue;
                }
                //2sum
                int new_target=target-nums[i]-nums[j];
                int l=j+1,r=nums.length-1;
                while(l<r) {
                    int sum = nums[l]+nums[r];
                    if(new_target==sum ) {
                        List<Integer> solution = Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                        results.add(solution);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1] ) {l++;}
                        while(l<r && nums[r]==nums[r+1] ) {r--;}
                    }
                    else if(new_target>sum) {l++;}
                    else if(new_target<sum) {r--;}					






                }
            }
		}
		return results;
    }
}