class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return  "";
        HashMap<Character,Integer> mps=new HashMap<>();
        HashMap<Character,Integer> mpt=new HashMap<>();
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mpt.put(ch,mpt.getOrDefault(ch,0)+1);
        }

        int have=0;
        int i=0;
        int low=0;

        for(int high=0;high<s.length();high++){

            char ch=s.charAt(high);
            if(mpt.containsKey(ch)){
                mps.put(ch,mps.getOrDefault(ch,0)+1);
                if(mpt.get(ch).intValue()==mps.get(ch).intValue()){
                    have++;
                }
                
            }

            while(have==mpt.size()){
                if(minlen>high-low+1){
                    minlen=high-low+1;
                    i=low;
                }
                char lowchar=s.charAt(low);
                if(mps.containsKey(lowchar)){
                    mps.put(lowchar,mps.get(lowchar)-1);
                    if (mps.get(lowchar) < mpt.get(lowchar)) {
                        have--;
                    }
                }
                low++;
              
            }
        }
        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(i,i+minlen);


    }
}