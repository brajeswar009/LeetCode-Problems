class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length() - 1;
        boolean res = true;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                res = false;
                break;
            }
            start++;
            end--;
        }
        if (res)
            return true;
        else
            return false;
    }
}