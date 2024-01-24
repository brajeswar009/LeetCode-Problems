class Solution {
    public int diagonalSum(int[][] mat) {
        int temp = 0;
        for (int i = 0, j = mat[0].length - 1; i < mat.length; i++, j--) {
            if (i != j)
                temp += mat[i][i] + mat[i][j];
            else
                temp += mat[i][j];
        }
        return temp;
    }
}