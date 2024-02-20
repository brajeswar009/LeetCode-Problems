class Solution {
    public void reverseString(char[] s) {
        recursiveApproach(s, 0, s.length - 1);
    }
    private void recursiveApproach(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
        recursiveApproach(s, left+1, right-1);
    }
}


/*
Iterative Approach:- TC- O(N), SC - O(1)
int start = 0;
int end = s.length-1;
while(start<=end){
char temp = s[start];
s[start] = s[end];
s[end] = temp;
start++;
end--;
}

*/