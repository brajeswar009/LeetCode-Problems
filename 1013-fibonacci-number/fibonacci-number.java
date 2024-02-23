class Solution {
    // Recursive Approach
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

/*
Iterative Approach
* int current = 0;
 * int previous = 1;
 * int next = 0;
 * 
 * for (int i = 0; i < n; i++) {
 * next = current + previous;
 * previous = current;
 * current = next;
 * }
 * return next;
 */