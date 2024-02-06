class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = value(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            int current = value(s.charAt(i));
            int next = value(s.charAt(i + 1));
            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }

    static int value(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        else
            return 0;
    }
}