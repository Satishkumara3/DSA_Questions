class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        int ans=0;
        int low=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            while(mp.containsKey(ch)){
                char c=s.charAt(low);
                mp.remove(c);
                low++;
            }
            mp.put(ch,1);
            ans=Math.max(ans,high-low+1);
            

        }
        return ans;
    }
}