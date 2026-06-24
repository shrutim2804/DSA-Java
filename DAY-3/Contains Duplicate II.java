
 * LeetCode 219: Contains Duplicate II
 * Pattern: Sliding Window + HashMap
 * Approach: Store the last seen index of each number. 
 * If the number appears again, check if the distance is <= k.
 * Time: O(n), Space: O(n)
-----------------------------------------------
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Key: number, Value: last index where it was seen
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If number exists in map AND the distance is <= k
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            // Update the latest index of this number
            map.put(nums[i], i);
        }
        return false;
    }
}
