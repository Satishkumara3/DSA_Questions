class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> tmp=new HashMap<Character,Integer>();

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tmp.put(ch,tmp.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> smp=new HashMap<Character,Integer>();
        
        int i=-1;
        int j=-1;
        int low=0;
        int have=0;
        int minlength=Integer.MAX_VALUE;
       
        for(int high=0;high<s.length();high++){
            char sch=s.charAt(high);
            if(tmp.containsKey(sch)){
                smp.put(sch,smp.getOrDefault(sch,0)+1);
                if(smp.get(sch).intValue()==tmp.get(sch).intValue()){
                    have++;
                }
            }

            while(have==tmp.size() && low<=high){
                char c=s.charAt(low);

                if( (high-low+1) < minlength){
                    minlength=high-low+1;
                    i=low;
                }
                
                if(smp.containsKey(c)){
                    smp.put(c,smp.getOrDefault(c,0)-1);
                    if(smp.get(c)<tmp.get(c)){
                        have--;
                    }
                }
                low++;


            }

        }
        if(minlength==Integer.MAX_VALUE){
            return "";
        }

        return s.substring(i,i+minlength);
        
    }
}