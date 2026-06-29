Leetode qs=75

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        // Outer loop: shrink the unsorted portion from the right
        for (int i = n - 1; i > 0; i--) {
            // Step 1: Find the maximum element in the unsorted portion (0 to i)
            int maxIndex = 0; // Assume the first element is the max
            for (int j = 1; j <= i; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j; // Found a new maximum
                }
            }
            
            // Step 2: Swap the maximum element with the element at index 'i'
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
}
