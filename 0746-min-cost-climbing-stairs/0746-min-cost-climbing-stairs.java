class Solution {
    int[] dp;
    public  int helper(int n,int[] cost){
        if(n<=1){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=+Math.min(helper(n-1,cost)+cost[n-1],helper(n-2,cost)+cost[n-2]);
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return helper(cost.length,cost);
    }
}






/*
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

*/