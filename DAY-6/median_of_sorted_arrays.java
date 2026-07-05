Leetcode qs=4
____________________________________________________________________________________________________________

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merge = new int[m + n];

        int k = 0;

        for (int i = 0; i < m; i++) {
            merge[k++] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            merge[k++] = nums2[i];
        }

        Arrays.sort(merge);

        int len = merge.length;

        if (len % 2 == 1) {
            return merge[len / 2];
        }

        return (merge[len / 2 - 1] + merge[len / 2]) / 2.0;
    }
}
