class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, maxSequence = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                maxSequence = Math.max(maxSequence, counter);
                counter = 0;
            }

        }
        maxSequence = Math.max(maxSequence, counter);
        return maxSequence;
    }
}

// time complexity - O(N), space complexity - O(1)