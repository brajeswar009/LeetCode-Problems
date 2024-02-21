class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int assumedSum = n * (n + 1) / 2;
        int acutalSum = 0;
        for (int i : nums) {
            acutalSum += i;
        }
        return assumedSum - acutalSum;
    }
}

/*
we know that only one number is missing and we
know sum of n natrual number is n*(n+1)/2 so using this logic
*/