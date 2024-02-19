class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        // set to -1 and -2 to return 0 if the input array is already sorted.
        int subArrStart = -1, subArrEnd = -2;
        int maxInSubArr = nums[0];
        int minInSubArr = nums[n - 1];

        // traversing from the 1st index as there is no element before 0th index
        // 1st to end to find the endpoint of the unsorted subarray
        for (int i = 1; i < nums.length; i++) {
            // eg. max(6,4), if(4 < 6) capture the issue point
            maxInSubArr = Math.max(maxInSubArr, nums[i]);
            if (nums[i] < maxInSubArr) {
                subArrEnd = i;
            }
        }

        // traversing from 2nd last element as there is no element next to the last index
        // last to 0th index to find the start point of unsorted subarray
        for (int j = n - 2; j >= 0; j--) {
            minInSubArr = Math.min(minInSubArr, nums[j]);
            if (nums[j] > minInSubArr) {
                subArrStart = j;
            }
        }
        // +1 because 0-based indexing is used
        return subArrEnd - subArrStart + 1;
    }
}

/*
Optimized approach
TC = O(N) and SC = O(1)

Simple approach
 * TC - O(nlogn) because built-in sort function uses O(logn) time
 * and traversing through nums array of length n take O(n) hence O(nlogn) time
 * SC - O(n).
 * The approach is simple, compare the input array with the sorted version of
 * that
 * array if we find any changes in the order then just returPn the length of the
 * unsorted array
 * 
 * int arr[] = new int[nums.length];
 * // copying element of nums to arr
 * System.arraycopy(nums, 0, arr, 0, nums.length);
 * Arrays.sort(arr);
 * // using two pointer to check whether the elements from both arrays are same
 * // or not
 * int start = 0, end = nums.length - 1;
 * // iterating over nums from start to check if all elements are in the same
 * // order with sorted arr or not if not break
 * for (; start < nums.length; start++) {
 * if (nums[start] != arr[start])
 * break;
 * }
 * // if the array is sorted then the above loop will run till the end
 * // so since it is a sorted array return 0
 * if (start >= nums.length - 1)
 * return 0;
 * 
 * // iterating over nums from end to check if all elements are in the same
 * // order with sorted arr or not if not break
 * for (; end >= 0; end--) {
 * if (nums[end] != arr[end])
 * break;
 * }
 * // returning the length of the unsorted subarray
 * return end - start + 1;
 */
