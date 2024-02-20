class Solution {
    public double myPow(double x, int n) {
        if(n < 0)
            return 1/myPowFinder(x, Math.abs(n));
        return myPowFinder(x, n);
    }
    public double myPowFinder(double x, int n){
        if(n == 0) return 1;
        double temp = myPowFinder(x, n/2);
        if(n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }
}