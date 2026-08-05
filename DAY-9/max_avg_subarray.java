Leetcode qs=643



class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int j = k - 1;
        int u = nums.length - k;

        double sum = 0;

        // First window sum
        for (int a = 0; a < k; a++) {
            sum += nums[a];
        }

        double maxSum = sum;

        // Slide the window
        while (i < u) {

            sum = sum - nums[i] + nums[j + 1];

            maxSum = Math.max(maxSum, sum);

            i++;
            j++;
        }

        return maxSum / k;
    }
}
