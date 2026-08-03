class Solution {
    public static int find(int[] nums1,int i,int[] nums2,int j){
            int len=0;
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]!=nums2[j]){
                    return len;
                }
                len++;
                i++;
                j++;
            }
            return len;

    }
    public int findLength(int[] nums1, int[] nums2) {
        
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<nums1.length;i++){
            
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans=Math.max(ans,find(nums1,i,nums2,j));
                }
            }
        }
        if(ans==Integer.MIN_VALUE) return 0;
        return ans;
    }
}