Leetcode qs no.=283
Time Complexity=O(n)
Space Complexity=O(1)
-------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
         int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }}
            while(j<l){
                nums[j]=0;
                j++;
            }
        
        
    }
}
