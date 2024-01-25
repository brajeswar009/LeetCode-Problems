class Solution {
    public int countAsterisks(String s) {
        int asteriskCount = 0, barCount = 0;
        for (char c : s.toCharArray()) {
            if(barCount%2==0){
                if(c == '*')
                    asteriskCount++;
            }
            if(c == '|')
                barCount++;
        }
        return asteriskCount;
    }
}