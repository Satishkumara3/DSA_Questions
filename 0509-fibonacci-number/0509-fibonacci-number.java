class Solution {
    static int dp[];
   

    public static int find(int n){
        if(n<=1) return n;

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=find(n-1)+find(n-2);
        return dp[n];

    }
    public int fib(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return find(n);
    }
}