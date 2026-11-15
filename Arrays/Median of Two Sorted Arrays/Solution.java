class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        while (low <= high) {

            int half1 = (low + high) / 2;
            int half2 = (m + n + 1) / 2 - half1;
            int maxLeft1 = (half1 == 0)? Integer.MIN_VALUE : nums1[half1 - 1];
            int minRight1 = (half1 == m)? Integer.MAX_VALUE : nums1[half1];
            int maxLeft2 = (half2 == 0)? Integer.MIN_VALUE : nums2[half2 - 1];
            int minRight2 = (half2 == n)? Integer.MAX_VALUE : nums2[half2];
            if (maxLeft1 <= minRight2 &&
                maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                return (Math.max(maxLeft1, maxLeft2)+ Math.min(minRight1, minRight2)) / 2.0;
            }
            else if (maxLeft1 > minRight2) {
                high = half1 - 1;
            } else {
                low = half1 + 1;
            }
        }
        return 0.0;


    }
}