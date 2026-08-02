class Solution {
    
    public static int fun(int n,int[] dp){
        if(n<=1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }


         return dp[n]=fun(n-1,dp)+fun(n-2,dp);
       
    }
    public int fib(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }

        return fun(n,dp);
    }
}