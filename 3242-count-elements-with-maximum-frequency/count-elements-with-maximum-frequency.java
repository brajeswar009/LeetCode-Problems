class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxNum = 0;
        // step 1: Finding maximum element of nums array to create another array of that
        // size
        for (int i : nums) {
            maxNum = Math.max(maxNum, i);
        }
        // step 2: Creating an array to store numbers count in their index positons
        // ex; 1 count in index 1, 2 count in index 2, 3 count in index 3 so on.
        int freq[] = new int[maxNum + 1];
        int maxCount = 0;
        for (int i : nums) {
            freq[i]++;
            maxCount = Math.max(maxCount, freq[i]);
        }
        // Step 3: Counting total occurance of maxCount 
        int total = 0;
        for (int i : freq) {
            if (i == maxCount)
                total += i;
        }
        return total;
    }
}