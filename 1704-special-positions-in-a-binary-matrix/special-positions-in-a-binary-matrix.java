class Solution {
    public int numSpecial(int[][] mat) {
        int rowArray[] = new int[mat.length];
        int colArray[] = new int[mat[0].length];
        // finding count of 1's in each row & col and storing in that specific index of
        // 1d arrays
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 1) {
                    rowArray[row]++;
                    colArray[col]++;
                }
            }
        }
        // traversing the array to check in which indices rowArr, colArr and mat all
        // three of
        // of them has 1,if yes count=+1
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (rowArray[i] == 1 && colArray[j] == 1 && mat[i][j] == 1)
                    count++;
            }

        }
        return count;
    }
}