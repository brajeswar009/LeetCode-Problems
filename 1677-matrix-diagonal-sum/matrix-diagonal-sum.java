//Since we know the primary diagonal is 00,11,22 and the secondary diagonal is 03, 11,
// 20 for 3*3 matrix
// same pattern for higher or lower where for primary both i & j are same and
// For secondary i is the same as primary and j is in decreasing order 
// from length of col to 0 using that logic here.
class Solution {
    public int diagonalSum(int[][] mat) {
        int temp = 0;
        for (int i = 0, j = mat[0].length - 1; i < mat.length; i++, j--) {
            // this is to tackle the edge case where central element ie 11 index in 3*3
            // matrix
            // hence add once not twice
            if (i != j)
                temp += mat[i][i] + mat[i][j];
            else
                temp += mat[i][j];
        }
        return temp;
    }
}
