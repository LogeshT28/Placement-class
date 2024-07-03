class GFG {
    // Returns the minimal length of a contiguous subarray of which the sum is at least target.
    static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += nums[end];

            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= nums[start];  
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    // Driver code
    public static void main(String[] args) {
        int target = 4;
        int nums[] = {1,4,4};
        System.out.println(minSubArrayLen(target, nums));  // Output: 2
    }
}
