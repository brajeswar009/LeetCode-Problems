class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[] = new int[nums.length];
        // copying element of nums to arr
        System.arraycopy(nums, 0, arr, 0, nums.length);
        Arrays.sort(arr);
        // using two pointer to check whether the elements from both arrays are same
        // or not
        int start = 0, end = nums.length - 1;
        // iterating over nums from start to check if all elements are in the same
        // order with sorted arr or not if not break
        for (; start < nums.length; start++) {
            if (nums[start] != arr[start])
                break;
        }
        // if the array is sorted then the above loop will run till the end
        // so since it is a sorted array return 0
        if (start >= nums.length - 1)
            return 0;

        // iterating over nums from end to check if all elements are in the same
        // order with sorted arr or not if not break
        for (; end >= 0; end--) {
            if (nums[end] != arr[end])
                break;
        }
        // returning the length of the unsorted subarray
        return end - start + 1;
    }
}

/*
 * TC - O(nlogn) because built-in sort function uses O(logn) time
 * and traversing through nums array of length n take O(n) hence O(nlogn) time
 * SC - O(n).
 * The approach is simple, compare the input array with the sorted version of
 * that
 * array if we find any changes in the order then take the length of the
 * unsorted array
 */
