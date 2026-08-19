Leetcode qs no= 70
================================================================================================
class Solution {
    public int climbStairs(int n) {
        int[] s=new int[45];
        s[0]=1;
        s[1]=2;
        for(int i=2;i<45;i++){
            s[i]=s[i-2]+s[i-1];
        }

      return s[n-1];
        
    }
}
