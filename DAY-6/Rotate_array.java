Leetcode qs=189
  Approach =Optimal
  T.C=O(n)
  S.C=O(1)

________  _________________________________________________________________________________________________________________________________________________

class Solution {

    public void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;// IMPORTANT PART AS k can be greater than nums.length so to avoid -ve indexing and also to ignore the reptitive rotation where after rotation we get the same array

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
