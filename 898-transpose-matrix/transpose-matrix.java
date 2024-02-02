class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        // for transpose row becomes col and col becomes row, 2*3 becomes 3*2
        int newMat[][] = new int[colLen][rowLen];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                newMat[col][row] = matrix[row][col];
            }
        }
        return newMat;
    }
}