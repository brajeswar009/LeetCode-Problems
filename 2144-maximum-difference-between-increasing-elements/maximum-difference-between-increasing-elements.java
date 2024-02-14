class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1, minNumTillNow = Integer.MAX_VALUE;
        for (int num : nums) {
            if (minNumTillNow < num) {
                ans = Math.max(ans, num - minNumTillNow);
            }
            minNumTillNow = Math.min(minNumTillNow, num);
        }
        return ans;
    }
}

/*Logic is:- to get the maximum difference then we have to subtract
 * the highest number from lowest number with keeping in mind that 
 * nums[i]<nums[j] as given in question. using this logic here
 O(N)
 */



/* BruteForce O(N^2)
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
*/