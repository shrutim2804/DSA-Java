Problem: Palindrome NO. Check
  Leetcode No.- 9

   Optimezed Soln--->


class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        int temp = x;
        int rev = 0;
        
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        
        return x == rev;
    }
}
