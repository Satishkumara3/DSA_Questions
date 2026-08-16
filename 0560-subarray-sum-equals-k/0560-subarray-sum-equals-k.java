class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }

            int find=sum-k;
            if(mp.containsKey(find)){
                count=count+mp.get(find);
            }

            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;

    }
}