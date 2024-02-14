class Solution {
    public int maximumDifference(int[] nums) {
        int res = 0;
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    res = nums[j] - nums[i];
                }
                maxDiff = Math.max(maxDiff, res);
            }
        }
        if(maxDiff == 0)
            return -1;
        else
            return maxDiff;
    }
}