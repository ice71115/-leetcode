class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n)
                    swap(matrix,i,j,n-j-1,n-i-1);   
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<n/2)
                swap(matrix,i,j,n-i-1,j);   
            }
        }
    }
    private void swap(int[][] mat,int a ,int b,int x, int y){
        int temp = mat[a][b];
        mat[a][b]=mat[x][y];
        mat[x][y]=temp;
    }
}