class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> checkArr = new ArrayList<>();
        // mark exisiting numbers with -ve sign
        for (int i : nums) {
            int temp = Math.abs(i) -1;
            nums[temp] = -1 * Math.abs(nums[temp]);
        }
        
        // filtering the +ve values which are missing indexes
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                checkArr.add(index + 1);
            }
        }
        return checkArr;
    }
}