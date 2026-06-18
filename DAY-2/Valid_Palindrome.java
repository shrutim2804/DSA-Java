Problem= Check Valid Palindrome by converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
Leetcode no.=125

class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Convert to lowercase
        s = s.toLowerCase();
        
        // Step 2: Filter only letters and digits
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                filtered.append(ch);
            }
        }
        
        // Step 3: Convert to String for comparison
        String original = filtered.toString();
        
        // Step 4: Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Step 5: Compare
        return original.equals(reversed);
    }
}
