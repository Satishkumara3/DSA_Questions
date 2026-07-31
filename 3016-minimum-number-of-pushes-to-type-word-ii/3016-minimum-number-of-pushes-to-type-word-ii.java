class Solution {
    public int minimumPushes(String word) {
        HashMap<Character ,Integer> mp=new HashMap<>();

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        
        Character[] arr=new Character[mp.size()];
        int index=0;
        for(Character ch:mp.keySet()){
            arr[index]=ch;
            index++;
        }


        Arrays.sort(arr, (a,b)->{
            return mp.get(b)-mp.get(a);
        });


   
        int sum=0;
        for(int i=0;i<arr.length;i++){
                int cost=i/8+1;
                sum+=cost*mp.get(arr[i]);
        }

        return sum;





    }
}