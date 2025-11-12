public class Q2_Count_Subarrays_With_Majority_Element_I {

    static int countMajoritySubarrays(int[] nums, int target) {
        // Copy input array to another variable (not necessary for logic, but as per task)
        int[] numsCopy = nums;
        int n = numsCopy.length;
        int count = 0;

        // Convert array elements to +1 (if equal to target) or -1 (if not)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (numsCopy[i] == target) ? 1 : -1;
        }

        // Check every subarray and count where target is majority (sum > 0)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3};
        int target1 = 2;
        System.out.println(countMajoritySubarrays(nums1, target1)); // Expected: 5

        int[] nums2 = {1, 1, 1, 1};
        int target2 = 1;
        System.out.println(countMajoritySubarrays(nums2, target2)); // Expected: 10

        int[] nums3 = {1, 2, 3};
        int target3 = 4;
        System.out.println(countMajoritySubarrays(nums3, target3)); // Expected: 0
    }
}
