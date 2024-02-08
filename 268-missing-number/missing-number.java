class Solution {
    public int missingNumber(int[] nums) {
    int xorNums = 0;
        for (int i = 1; i <= nums.length; i++) {
            xorNums ^= i;
        }

        int xorN = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xorN ^= nums[i];
        }
        return xorNums ^ xorN;
    }
}