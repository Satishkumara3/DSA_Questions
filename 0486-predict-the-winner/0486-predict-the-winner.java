class Solution {
    public static int calculate(int[] arr,int i,int j,int[][] dp){
        if(i==j){
            return arr[i];
        }

        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }

        int leftpick=arr[i]-calculate(arr,i+1,j,dp);
        int rightpick =arr[j]-calculate(arr,i,j-1,dp);

        return dp[i][j]=Math.max(leftpick,rightpick);




    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;

        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }


        return calculate(nums,0,n-1,dp)>=0;
        
    }
}