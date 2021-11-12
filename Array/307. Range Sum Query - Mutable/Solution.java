class NumArray {
    int[] tree;
    int n;
    public NumArray(int[] nums) {
        n=nums.length;
        tree=new int[n<<1];
        for(int i=n;i<n*2;i++){
            tree[i]=nums[i-n];
        }
        for(int i=n-1;i>0;i--){
            tree[i]= tree[i*2]+tree[i*2+1];
        }

    }
    
    public void update(int index, int val) {
        for(tree[index+=n]=val;index>1;index>>=1){
            tree[index>>1]=tree[index]+tree[index^1];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(left+=n,right+=n;left<=right;left>>=1,right>>=1){
            if((left&1)==1) sum+=tree[left++]; 
            if((right&1)==0) sum+=tree[right--]; 
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */