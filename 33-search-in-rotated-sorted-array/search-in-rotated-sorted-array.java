class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // taking last element of array to find out left and right sorted parts
        int lastEle = nums[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > lastEle && nums[mid] <= lastEle) {
                // target is in the left sorted part while we are in right sorted half of array
                // so we should go to left side
                right = mid - 1;
            } else if (target <= lastEle && nums[mid] > lastEle) {
                // target is in right sorted part and we are in left sorted part of array
                // so we should go to right side
                left = mid + 1;
            } else {
                // this part indicates both target and we are in same sorted part of array
                // either
                // left or right, so using binary search on either sorted part to get the index
                // of target
                if (target == nums[mid]) {
                    return mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*
 * We assume that there would be 4 possible scenarios,
 * 1. target in left sorted part and we are in right sorted part
 * => in this case go to target i.e. go to left
 * 
 * 2. target in right sorted part and we are in left sorted part
 * => in this case go to right
 * 
 * 3 & 4. target is in left sorted part and we are also in left sorted part
 * or, target is in right sorted part and we are also in right sorted part
 * => in this case since we are in a sorted array use binary search to find the
 * index of the target element.
 * 
 */