class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        // finding prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i] = (i == 0) ? nums[i] : prefix[i - 1] + nums[i];
        }

        // finding suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = (i == n - 1) ? nums[i] : suffix[i + 1] + nums[i];
        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int prefixSum = (i == 0) ? 0 : prefix[i - 1];
            int suffixSum = (i == n - 1) ? 0 : suffix[i + 1];

            // leftSum and rightSum as we deduced below
            int leftSum = i * nums[i] - prefixSum;
            int rightSum = suffixSum - (n - 1 - i) * nums[i];

            ans[i] = leftSum + rightSum;
        }
        return ans;
    }
}

/*
TC - O(n), SC- O(n)
 * Logic--
 * if we have an array of 'n' elements and to find sum of absolute difference
 * of ith element, then some of the elements will be higher than i, and some of
 * them will be lesser so, if we represent them in number series
 * 1,2,3,4...i-1, i, i+1, i+2,...n-1
 * so there are total n-1 elements in the array if we use 0 based indexing
 * so left sum will be = (a[i] - a[0]) + (a[i] - a[1])+ (a[i] - a[2]).....
 * + (a[i] - a[i-1]) {a[i] - num, because a[i] will be a bigger number than the
 * nums}
 * so in left there are i terms since 0 to i-1
 * if we simplify this pattern then it will be
 * (a[i] + a[i]+ a[i]+....a[i]) - (a[0]+a[1]+a[2]...+a[i-1])
 * => i*a[i] - prefix sum of [i-1]
 * 
 * right sum = (a[i+1] - a[i]) + (a[i+2] - a[i]) + .... (a[n-1] - a[i])
 * so in right there are will be = total elements - total left element =>
 * (n - 1 - i)
 * if we simplify the matematical pattern,
 * (a[i+1]+a[i+2]+...+a[n-1]) - (a[i]+a[i]+a[i]...+a[i])
 * => suffix sum of i+1 - (n-1-i)*a[i]
 * 
 * so the o/p is res[i]= leftsum + right sum
 * => i*a[i] - prefix sum of [i-1] + suffix sum of [i+1] - (n-1-i)*a[i]
 */