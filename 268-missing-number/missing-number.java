class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = -1;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i == nums[i])
                continue;
            else {
                missingNum = i;
                break;
            }
        }
        if (missingNum != -1) {
            return missingNum;
        } else
            return n;
    }
}