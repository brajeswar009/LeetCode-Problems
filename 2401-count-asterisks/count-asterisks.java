class Solution {
    public int countAsterisks(String s) {
        String barArr[] = s.split("[|]");
        int count = 0;
        for (int i = 0; i < barArr.length; i++) {
            if (i % 2 == 0) {
                if (barArr[i].contains("*")) {
                    String temp = barArr[i];
                    for (int j = 0; j < barArr[i].length(); j++) {
                        if (temp.charAt(j) == '*')
                            count++;
                    }
                }
            }
        }
        return count;
    }
}