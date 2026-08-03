class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int low=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];

           
            while( low<=high && sum>=target){
                sum=sum-nums[low];
                ans=Math.min(ans,high-low+1);
                low++;
            }
            



        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;

    }
}