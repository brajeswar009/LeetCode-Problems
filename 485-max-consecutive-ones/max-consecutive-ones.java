class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 1, maxSequence = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                maxSequence = Math.max(maxSequence, counter);
                counter = 1;
            }

        }
        maxSequence = Math.max(maxSequence, counter);
        return maxSequence-1;
    }
}

// time complexity - O(N), space complexity - O(1)