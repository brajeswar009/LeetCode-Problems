class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
/*
Time complexity - O(N)
Space Complexity - O(1)
Logic is, as we can observe from the question that, a particular index's value is the sum of the previous index and the current index
so using this logic to add the index values to its previous one.
*/
