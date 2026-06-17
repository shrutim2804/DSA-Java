Problem: Find missing no. from given int arr[] and return the missing no from [0,n]
  Leetcode No.- 268

BRUTE FORCE-
  Time Complexity: O(n^2)
--------------------------
class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            boolean flg=true;// to check if a particular no. from[0,n] exits in the nums[]
            for(int j=0;j<nums.length;j++){
            if(i==nums[j]){
                flg=true;//found
                break;// found so don't check further
            }
                else
                flg=false;// not found=missing

            
        }
        if(flg==false)
            return i;// returning the missing no.

        }
        return -1;// Should never reach here

    }

}

-------------------------------------------------------------------------------------------------------------------------------------------------

OPTIMIZATION USING HASHMAP-
  Time Complexity: O(n)
-----------------------------------  
 
  import java.util.HashMap;
class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int num:nums){
            map.put(num,true);
        }
        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i))
                return i;
        }
        return -1;
    }
}
