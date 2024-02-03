class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        // if a 3x3 matrix given so total 9 element will be stored in arr
        int arr[] = new int[rowLen * colLen];
        int row = 0, col = 0;
        int index = 0;
        boolean up = true;
        // for traversing till the last row and last col
        while (row < rowLen && col < colLen) {
            // for going upwards direction
            if (up) {
                // since in upward row decreses and col increses so running till that condition
                while (row > 0 && col < colLen - 1) {
                    arr[index++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[index++] = mat[row][col];
                // if we reached last col like (0,2) in 3x3 matrix
                // then go to next row ie(1st row) otherwise continue with next col
                if (col == colLen - 1) {
                    row++;
                } else {
                    col++;
                }
            }
            // for going in downward direction
            else {
                // since in downward col decreses and row increses so running till that
                // condition
                while (row < rowLen - 1 && col > 0) {
                    arr[index++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[index++] = mat[row][col];
                // if we reached last row like (2,1) in 3x3 matrix
                // then go to next col ie(2nd col) otherwise continue with next row
                if (row == rowLen - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            // after each iteration direction of motion changes so reversing the previos
            // direction of motion
            up = !up;
        }
        return arr;
    }
}