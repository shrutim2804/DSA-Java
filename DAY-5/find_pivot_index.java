LEETCODE QS=724

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]+nums[i];
        } 
        if(prefix[nums.length-1]-prefix[0]==0)
        return 0;
        else{
        for(int i=0;i<nums.length-1;i++){
        if(prefix[i]==(prefix[nums.length-1]-prefix[i+1])){   
        return i+1;
        }
        }}
        return -1;
    }
}
