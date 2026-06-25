/*
 * LeetCode 387: First Unique Character in a String
 * Pattern: HashMap (Frequency Count)
 * Approach: First pass to count frequencies. Second pass to find first character with count 1.
 * Time: O(n), Space: O(1) -> because we only have 26 letters
 */
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find the first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // No unique character found
    }
}
