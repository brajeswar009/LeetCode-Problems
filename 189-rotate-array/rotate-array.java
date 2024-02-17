class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // reverse the complete array
        // [1,2,3,4,5] => [5,4,3,2,1]
        reverseArr(nums, 0, n - 1);
        //reverse the first half(till k-1) assume k=2
        // [5,4,3,2,1] => [4,5,3,2,1]
        reverseArr(nums, 0, k - 1);
        // reverse the second half 
        // [4,5,3,2,1] => [4,5,1,2,3]
        reverseArr(nums, k, n - 1);
    }

    static void reverseArr(int nums[], int start, int end) {
        // this function reverses an array with start
        // end index postion using two pointer
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

// TC = O(N), SC = O(1)