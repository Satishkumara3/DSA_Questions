class Solution {
    static int[] dp;
    public static int helper(int n,int[] arr){
        if(n>=arr.length){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=arr[n]+Math.min( helper(n+1,arr),helper(n+2,arr));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost),helper(1,cost));
    }
}