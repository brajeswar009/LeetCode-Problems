class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char jewelsArr[] = jewels.toCharArray();
        char stonesArr[] = stones.toCharArray();
        int count = 0;
        for (char j : jewelsArr) {
            for (char s : stonesArr) {
                if(j == s)
                    count++;
            }
        }
        return count;
    }
}