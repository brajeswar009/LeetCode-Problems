class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            int charAscii = sb.charAt(i);
            if (65 <= charAscii && charAscii <= 90) {
                charAscii += 32;
                sb.deleteCharAt(i);
                sb.insert(i, (char) charAscii);
            }
        }
        return sb.toString();
    }
}