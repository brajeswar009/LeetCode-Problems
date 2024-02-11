class Solution {
    public int mySqrt(int x) {
        // binary search approach where we find the mid to change the target range
        // using long to tackle huge numbers (O(log n)) time complexity
        int left = 0, right = x;
        int res = 0;
        int mid = 0;
        while (left <= right) {
            // to find the perfect mid without overflow (simiar to left+right/2)
            mid = left + (right - left) / 2;

            // if the mid^2 is smaller than x then the desired number will be in the right 
            // half of the mid so shifting the left pointer
            if ((long)mid * mid <= (long)x) {
                res = mid;
                left = mid + 1;
            } 
            // if the mid^2 is bigger than x then the desired number 
            // will be in the left half of the mid so shifting the right pointer
            else if ((long)mid * mid > (long)x) {
                right = mid - 1;
            } 
        }
        return res;
    }
}