class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // base case
        if(n == 1)
            return nums;
        // to get the range of nums from an array, it includes 0 -> n/2-1
        int left[] = Arrays.copyOfRange(nums, 0, n/2);
        // n/2 -> n-1
        int right[] = Arrays.copyOfRange(nums, n/2, n);
        // recursive call to sort left half
        left = sortArray(left);
        // recursive call to sort right half
        right = sortArray(right);
        // two merge the arrays
        return merge2SortedArray(left,right);
    }

    static int[] merge2SortedArray(int left[], int right[]){
        // i and j are the pointers for left and right array
        int i = 0, j = 0;
        // k is the pointer for the index of ans array
        int k = 0;
        int ans[] = new int[left.length+right.length];
        // run the loop till both of the arrays not traversed completely
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        //remaining elements to be pushed from left array
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        //remaining elements to be pushed from right array
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}