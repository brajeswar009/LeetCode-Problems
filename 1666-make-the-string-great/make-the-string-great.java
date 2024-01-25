class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length()-1;) {
            int charAscii = sb.charAt(i);
            int nextAscii = sb.charAt(i+1);
            if(nextAscii == (charAscii+32) || nextAscii == (charAscii-32)){
                sb.delete(i, i+2);
                i = 0;
            }
            else
                i++;
        }
        return sb.toString();
    }
}