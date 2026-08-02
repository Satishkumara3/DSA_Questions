class Solution {
    public int helper(int[] arr,int i,int j,int [][] dp){
        if(i<=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int pickleft=helper(arr,i+1,j,dp);
        int pickright=helper(arr,i,j-1,dp);

        return dp[i][j]=Math.max(pickleft,pickright);
    }
    public boolean stoneGame(int[] piles) {
        int[][] dp=new int[piles.length][piles.length];
        return helper(piles,0,piles.length-1,dp) >=0;
    }
}