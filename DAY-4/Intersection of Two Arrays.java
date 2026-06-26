
 * LeetCode 349: Intersection of Two Arrays
 * Pattern: HashSet
 * Approach: Store all elements of nums1 in a HashSet. Check nums2 against it.
 * Time: O(n + m), Space: O(n)


   
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Store unique elements from nums1
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Step 2: Check which elements from nums2 exist in set1
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        
        // Step 3: Convert HashSet to int array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
