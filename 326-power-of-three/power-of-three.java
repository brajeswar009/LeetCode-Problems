class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}

/*
Most efficient TC - O(1), SC - O(1)
here n is of int type and max value of int is 2147483647, knowing this
we can deduce the maximum value of n that also power of 3,
3^[log(base 3)Max_INT] = 3^[19.56] = 3^19 = 1162261467
Therefore, the possible values of n where we should return true
are 3^0, 3^1, 3^2,...3^19. Since 3 is a prime number, the only divisor of
3^19 are 3^0, 3^1,... 3^19 therefore all we need to do is divide 3^19 by n, 
if the remainder is 0 means n is divisor of 3 otherwise not.

 * // Approach -1 (iterative)(keep on dividing the input, if it reaches 1 then
 * // it is a power of 3, if it cann't reach 1 then not a power of 3)
 * // ex, 27/3 = 9/3 = 3/3 = 1 (power of 3)
 * // 45/3 = 15/3 = 5 (not a power of 3)
 * TC - O(logn base 3), SC - O(1)
 * if(n < 1)
 * return false;
 * while (n % 3 == 0) {
 * n/=3;
 * }
 * if(n == 1)
 * return true;
 * else
 * return false;
 * 
 * // Approach -2 (Recursive)
 * //TC - O(logn base 3), 
 * if(n <= 1) return n == 1;
 * return (n % 3) == 0 && isPowerOfThree(n/3);
 */