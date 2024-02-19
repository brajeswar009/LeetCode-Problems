class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int subArrStart = -1, subArrEnd = -2;
        int maxInSubArr = nums[0];
        int minInSubArr = nums[n - 1];

        for (int i = 1; i < nums.length; i++) {
            int j = n - i - 1;
            maxInSubArr = Math.max(maxInSubArr, nums[i]);
            if (nums[i] < maxInSubArr) {
                subArrEnd = i;
            }
            minInSubArr = Math.min(minInSubArr, nums[j]);
            if (nums[j] > minInSubArr) {
                subArrStart = j;
            }
        }
        return subArrEnd - subArrStart + 1;
 
    }
}