class Solution {
    public int reverse(int x) {
        long n=0l,bin=0l;
        while(x!=0){
            n=n*10l;
            bin=x%10l;
            n=n+bin;
            x=x/10;
        }
        x=(int)n;
        if(x==n){
            return x;
        }
        return 0;
    }
}
