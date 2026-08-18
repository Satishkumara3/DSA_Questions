class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int a=n;
             n=a;
            int pro=1;
            while(n!=0){
                int r=n%10;
                pro*=r;
                n=n/10;
            }
            if(pro%t==0){
                return a;
            }
            n=a+1;

        }
    }
}