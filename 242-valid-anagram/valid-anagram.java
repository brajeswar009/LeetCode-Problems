class Solution {
    public boolean isAnagram(String s, String t) {
        // since only lowercase used created an to store count of letters
        int count[] = new int[26];
        // checking for edge cases
        if (s == null || t == null || s.length() != t.length())
            return false;

        // converting string to char array and increasing the count of letters as per
        // their position in
        // alphabet order(to get alphabet order substracting from a) eg; h-a(104-97) = 7
        // so count[7] +1 etc.
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        // converting string to char array and decresing the count of letters as per
        // their position in alphabet order
        for (char d : t.toCharArray()) {
            count[d - 'a']--;
        }
        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;
    }
}