class Solution {
    public int[][] generateMatrix(int n) {
        int i=0,j=0;
        int num=1;
        int direction=1;
        int[][] results = new int[n][n];
        while(num<=n*n){
            System.out.print(i);
            System.out.print(j);
            System.out.print(" ");
            System.out.print(direction);
            System.out.print(" ");
            results[i][j]=num;
            
            int new_i=i+direction/2;
            int new_j=j+direction%2;

            if(new_i>n-1 || new_j>n-1|| new_j<0 || new_i<0 ||results[new_i][new_j]!=0){
                switch(direction){
                    case 1:
                        direction=2;
                        break;
                    case 2:
                        direction=-1;
                        break;
                    case -1:
                        direction=-2;
                        break;
                    case -2:
                        direction=1;
                        
                }    
                i=i+direction/2;
                j=j+direction%2;
            }else{
                i=new_i;
                j=new_j;
            }

            num++;
        }
        return results;
    }
}