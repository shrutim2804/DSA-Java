Leetcode qs-3754
_________________________________________________________________________________________________________________________________________________
class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int d=0;
        int no=0;
        long sum=0;
        int temp=n;
        long rev=0;
        while(temp>0){
            d=temp%10;
            if(d!=0){
            sum+=d;
            no=no*10+d;        
        }
         temp/=10;
        }
        while(no>0){
            d=no%10;
            rev=rev*10+d;
            no/=10;
        }
        ans=sum*rev;
        return ans;
    }
}
