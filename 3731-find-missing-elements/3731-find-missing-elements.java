class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new  ArrayList<>();
        HashMap<Integer,Boolean> mp=new HashMap<>();
        Arrays.sort(nums);
        int x=nums[0]+1;
        int y=nums[nums.length-1];

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],true);
        }


        while(x<=y){
            if(!mp.containsKey(x)){
                list.add(x);
               
            }

             x++;
        }
        return list;


    }
}