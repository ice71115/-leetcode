class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(0,0,inorder.length-1,preorder,inorder);
    }
    private TreeNode buildTreeHelper(int pre,int in,int inEnd,int[] preorder, int[] inorder){
        if(pre>preorder.length-1 || in>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre]);
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root.val){
                
                root.left=buildTreeHelper(pre+1,in,i-1,preorder,inorder);
                root.right=buildTreeHelper(pre+i-in+1,i+1,inEnd,preorder,inorder);
                break;
            }
            
        }
        return root;
        
    }
}