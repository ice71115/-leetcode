class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree2(0,inorder.length-1,postorder.length-1,inorder,postorder);
    }
    private TreeNode buildTree2(int in,int inEnd,int postEnd,int[] inorder,int[] postorder){
        if(in>inEnd || postEnd<0){
            return null;
            
            
        }
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        
        for(int i =0;i<inorder.length;i++){
            if(inorder[i]==root.val){
                root.left=buildTree2(in,i-1,postEnd-1-inEnd+i,inorder,postorder);
                root.right=buildTree2(i+1,inEnd,postEnd-1,inorder,postorder);
            }
        }
        return root;
        
        
    }
}

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int pl=postorder.length -1;
        int il=pl;
        TreeNode root = new TreeNode(postorder[pl--]);
        TreeNode p = null;
        stack.push(root);
        while(pl>=0){
            
            TreeNode newNode = new TreeNode(postorder[pl]);
            //Look for right child
            if(stack.peek().val!=inorder[il]){
                stack.peek().right=newNode;
                
            }else{
                //Look for left child from bottom right to top
                while(!stack.empty() && stack.peek().val==inorder[il]){
                    p =stack.pop();
                    il--;
                }
                p.left=newNode;
            }
            stack.push(newNode);
            pl--;    
        }

        return root;
    }
}