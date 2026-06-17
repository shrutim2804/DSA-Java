Problem: Two Sum
 * Given an array of integers nums and an integer target, return indices of two numbers that add up to target.
  Leetcode No.- 1


  Approach used= Brute Force
  
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return immediately when found
                }
            }
        }
        return new int[]{}; // Return empty array if not found
    }
}

  
