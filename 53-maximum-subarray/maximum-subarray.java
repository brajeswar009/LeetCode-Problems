class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; 
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = max > sum ? max : sum;
            //If less than 0, then the current window can be discarded
            // because it is not going to be useful to find the maximum sum subarray
            sum = sum > 0 ? sum : 0;
        }
        return max;
    }
}

/*
This is called Kadane's algorithm.
Time Complexity - O(N), and space complexity - O(1)

*/
