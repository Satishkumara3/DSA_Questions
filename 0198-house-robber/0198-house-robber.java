class Solution {
    int dp[];
    public int helper(int[] nums,int i){
        if(i>=nums.length) return 0;

        if(dp[i]!=-1){
            return dp[i];
        }

        

        int take=nums[i]+helper(nums,i+2);
        int nottake=helper(nums,i+1);

        return  dp[i]=Math.max(take,nottake);
    }

    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);

        return helper(nums,0);
    }
}