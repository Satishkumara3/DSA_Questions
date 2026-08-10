class Solution {
    static int [][] dp;
    public static int minsum(int i,int j,int m,int n,int[][] grid){

        if(i>=m || j>=n) return Integer.MAX_VALUE;

        if(i==m-1 && j==n-1) return grid[i][j];


        if(dp[i][j]!=-1) return dp[i][j];


        return dp[i][j]=grid[i][j]+Math.min(minsum(i+1,j,m,n,grid),minsum(i,j+1,m,n,grid));
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return minsum(0,0,m,n,grid);
    }
}