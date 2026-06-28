LEETCODE SOLN:169
APPROACH =BRUTE FORCE METHOD
S.C=O(n^2)

--------------------------------------------------------------------------------------------------------------------------------------
  
class Solution {
    public int majorityElement(int[] nums) {
        int max=(nums.length)/2;
        int m=max;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
                
            }
            if(count>m){
            m=count;
            if(count>=max )
           return nums[i];
            }
        }
       return -1; 
    }
}
