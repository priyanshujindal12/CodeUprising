public class Q3_Longest_Non_Decreasing_Subarray_After_Replacing_at_Most_One_Element  {

    static int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        // left[i] = length of non-decreasing subarray ending at index i
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        // right[i] = length of non-decreasing subarray starting at index i
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }

        // Case 1: No replacement needed — take the longest existing subarray
        int maxLen = 0;
        for (int len : left) {
            maxLen = Math.max(maxLen, len);
        }

        // Case 2: Replace one element to connect two parts
        for (int i = 0; i < n; i++) {
            // Option 1: Replace nums[i] to connect left and right subarrays
            if (i > 0 && i < n - 1 && nums[i - 1] <= nums[i + 1]) {
                maxLen = Math.max(maxLen, left[i - 1] + right[i + 1] + 1);
            }

            // Option 2: Replace element before i to extend from i
            if (i > 0) {
                maxLen = Math.max(maxLen, left[i - 1] + 1);
            }

            // Option 3: Replace element after i to extend from i
            if (i < n - 1) {
                maxLen = Math.max(maxLen, right[i + 1] + 1);
            }
        }

        return Math.min(maxLen, n); // Ensure we don't exceed array length
    }


    public static void main(String[] args) {
        

        int[] nums1 = {1, 2, 3, 1, 2};
        System.out.println(longestSubarray(nums1)); // Expected output: 4

        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println(longestSubarray(nums2)); // Expected output: 5

        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println(longestSubarray(nums3)); // Expected output: 2
    }
}
