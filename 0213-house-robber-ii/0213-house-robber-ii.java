class Solution {
    int dp[];
    
    public int helper(int i,int[] nums,int limit){
        if(i>=limit){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }


        int take=nums[i]+helper(i+2,nums,limit);
        int nottake=helper(i+1,nums,limit);

        dp[i]=Math.max(take,nottake);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        dp=new int[n];
     

        Arrays.fill(dp,-1);
        int case1= helper(0,nums,n-1);
        Arrays.fill(dp,-1);
        int case2= helper(1,nums,n);


        int x=Math.max(case1,case2);
        return x;
    
    }
}