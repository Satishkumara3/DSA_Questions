class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        // store all element inside the hashmap
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        if(k==1){
            for(int e: mp.keySet()){
                int count=mp.get(e);
                if(count==1){
                    ans=Math.max(ans,e);
                }
            }
        }
        else if(k==nums.length){
            for(int i=0;i<nums.length;i++){
                ans=Math.max(ans,nums[i]);
            }
        }
        else if(k>1 && k<nums.length){
            int st=mp.get(nums[0]);
            int lst=mp.get(nums[nums.length-1]);
            if(st==1 && lst!=1){
                ans=nums[0];
            }
            else if(st!=1 && lst==1){
                ans=nums[nums.length-1];
            }
            else if(st==1 && lst==1){
                ans=Math.max(nums[0],nums[nums.length-1]);
            }

        }
        return ans;
    }
}