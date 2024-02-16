class NumArray {
    int prefixSum[];
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            prefixSum[i] = i == 0? nums[0]: prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0)
            return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }
}

/*
Time complexity - O(N) Space complexity - O(N)
Here in this question, for a given array of integers, it asked to return the sum of integers with 
in a given range. 

 * Arr = {-2, 0, 3, -5, 2, -1}
 * prefixSum array = {-2, -2, 1, -4, -2, -3}
 * 0th index value will remain the same and the next values will be summed till that
 * index
 * means if we are calculating prefix sum of index 3 then that will be the sum of
 * elements of
 * index 0 to index 3. So put in other way nums[i] + prefix[i-1] will result the
 * same except
 * for 0th index.
 * We used prefix sum because it will be easier to find the sum range using this
 * instead
 * of running a loop from left to right index and storing the sum in a variable
 * because
 * in prefix sum it already has the sum of each range
 * if the range is (0,3) then the result will prefix the 3rd index
 * and if the range is (2,4) then the result will be
 * find the prefix of index 4 and subtract prefix 1 then we will get (2,4)
 * ---------> (0,2) index
 * {-2, -2, 1, -4, -2, -3}
 * ----------------->(0,4) index so to get 2,4 subtract (0,1) from them

*/


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
