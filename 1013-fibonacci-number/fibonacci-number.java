class Solution {
    public int fib(int n) {
        return fibHelper(n);
    }
    public int fibHelper(int n){
        if(n == 0 || n == 1)
            return n;
        int a = fibHelper(n-1);
        int b = fibHelper(n-2);
        return a+b;
    }
}