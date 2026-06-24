
 * LeetCode 242: Valid Anagram
 * Pattern: Frequency Count
 * Approach: Count characters in s (increment), count in t (decrement).
 * If all counts are zero, they are anagrams.
 * Time: O(n), Space: O(1) -> because array size is fixed (26)
–-------–-------------------------------------------------------------------------------

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Array to store count of 26 lowercase letters
        int[] count = new int[26];
        
        // Increment for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        // If all counts are zero, they are anagrams
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
