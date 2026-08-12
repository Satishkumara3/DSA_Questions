class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] arr=new int[matrix.length][matrix[0].length];

        int total=0;
        for(int j=0;j<n;j++){
            arr[0][j]=matrix[0][j];
            if(matrix[0][j]==1) total++;
        }

         for(int i=1;i<m;i++){
            arr[i][0]=matrix[i][0];
             if(matrix[i][0]==1) total++;
        }
        




        for(int i=1;i<m;i++ ){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0) continue;
                int up=arr[i-1][j];
                int tri=arr[i-1][j-1];
                int left=arr[i][j-1];
                int amin=Math.min(up,Math.min(tri,left));
                
                arr[i][j]=matrix[i][j]+amin;
                   
                
                total+=arr[i][j];
            }
        }
        return total;
    }
}