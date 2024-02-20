class Solution {
    public double myPow(double x, int n) {
        //2^-3 = 1/2^3 so dividing the result by 1 if n is -ve
        if(n < 0)
            return 1/myPowFinder(x, Math.abs(n));
        return myPowFinder(x, n);
    }
    public double myPowFinder(double x, int n){
        if(n == 0) return 1;
        // x^n = x * x^n-1 (one way to find power)
        // if n is even, then x^n = x^n/2 * x^n/2
        // if n is odd, then x^n = x^n/2 * x^n/2 * x 
        double temp = myPowFinder(x, n/2);
        if(n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }
}