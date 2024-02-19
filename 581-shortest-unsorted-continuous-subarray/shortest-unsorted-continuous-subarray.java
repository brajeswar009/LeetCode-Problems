class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[] = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        Arrays.sort(arr);
        int start = 0, end = nums.length - 1;
        for (; start < nums.length; start++) {
            if (nums[start] != arr[start])
                break;
        }
        if (start >= nums.length - 1)
            return 0;
        for (; end >= 0; end--) {
            if (nums[end] != arr[end])
                break;
        }
        return end - start + 1;
    }
}