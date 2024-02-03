class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean res = true;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for (int i = 0; i < rowLen - 1; i++) {
            for (int j = 0; j < colLen - 1; j++) {
                if (matrix[i][j] == matrix[i + 1][j + 1]) {
                    continue;
                } else {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
 * if we closely observe the pattern then we are checking diagonals only and as
 * we know diagonals will be
 * present at 1 index addition apart from both row and col for eg(for index 00
 * the next diagonal will be add
 * 1 to both row and col value ie 11, similarly for 11 -> 22->33. For
 * 01->12->23 etc.)
 * so using this logic to traverse the matrix as we normally do and check if
 * i,j == i+1,j+1 if yes
 * continue if not then return false
 * we need to take care of 1 corner case to avoid out of bound error that we need
 * to avoid traversing to
 * last col and last row because if we compare at that position for ex; in 3x4
 * matrix 0,3 will be element of
 * last col so if we use the condition i,j == i+1,j+1 here it would result to out
 * of bound error and same for
 * last row like 2,0 so for this reason traversing till rowLen-1 and colLen-1
