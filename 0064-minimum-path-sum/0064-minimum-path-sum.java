class Solution {
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];

        dp[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }

        for(int i=1;i<m;i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);
            }
        }

        return dp[m-1][n-1];
    }
}


















/*
(dp + memoization)

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

*/