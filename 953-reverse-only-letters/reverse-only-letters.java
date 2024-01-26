class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        // left as 0 and right as last element of char array
        int left = 0;
        int right = arr.length - 1;
        // empty char variable
        char temp = '\u0000';
        while (left <= right) {
            // to get ascii value of character present at that index
            int leftAscii = arr[left];
            int rightAscii = arr[right];
            // checking of both leftAscii & rightAscii variable is in the alphabet range, if
            // yes swap
            if ((65 <= leftAscii && leftAscii <= 90 || 97 <= leftAscii && leftAscii <= 122) &&
                    (65 <= rightAscii && rightAscii <= 90 || 97 <= rightAscii && rightAscii <= 122)) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            // if leftAscii is not an alphabet then move left pointer one step ahead.
            else if (!(65 <= leftAscii && leftAscii <= 90 || 97 <= leftAscii && leftAscii <= 122)) {
                left++;
            }
            // // if rightAscii is not an alphabet then move right pointer one step back.
            else if (!(65 <= rightAscii && rightAscii <= 90 || 97 <= rightAscii && rightAscii <= 122)) {
                right--;
            }

        }
        // converting char array to string
        String s1 = new String(arr);
        return s1;
    }
}