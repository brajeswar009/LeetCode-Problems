class Solution {
    public int longestOnes(int[] nums, int k) {
        // uses variable length sliding window technique
        int zeroCount = 0;
        int ans = 0, leftPointer = 0;
        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if (nums[rightPointer] == 0)
                zeroCount++;
            // make the window valid if became invalid by crossing k limit
            // of zero count
            while (zeroCount > k) {
                if (nums[leftPointer] == 0) {
                    zeroCount--;
                }
                leftPointer++;
            }
            // taking max between ans(which has previous length) 
            // and window length(r-l+1)(current length)
            ans = Math.max(ans, rightPointer - leftPointer + 1);
        }
        return ans;
    }
}