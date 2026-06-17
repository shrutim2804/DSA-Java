Problem: Reverse a String
 * Given an array of Characters nums and u have to create a function to reverse that char in that array. 
  Leetcode No.- 344



class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
}
