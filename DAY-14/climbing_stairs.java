Leetcode qs no= 70
================================================================================================
class Solution {
    public int climbStairs(int n) {
        int c=0;
        int[] s=new int[45];
        s[0]=1;
        s[1]=2;
        s[2]=3;
        for(int i=3;i<45;i++){
            s[i]=s[i-2]+s[i-1];
        }

      return s[n-1];
        
    }
}
