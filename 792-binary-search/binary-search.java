class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int res = binarySearch(nums, target, low, high);
        return res;
    }
    public int binarySearch(int nums[], int target, int low, int high){
        int mid = 0;
        // indicates only 1 element left
        if (low > high) {
            return -1;
        } 
        else
            // to avoid overflow of datatype this formula to find mid is used
            mid = low + (high - low) / 2;
        if (target == nums[mid])
            return mid;
        else if (target > nums[mid])
            return binarySearch(nums, target, mid + 1, high); // target is on right side 
        else
            return binarySearch(nums, target, low, mid - 1); // target is on left side
    }
}

// TC - O(log n), SC - O(1)