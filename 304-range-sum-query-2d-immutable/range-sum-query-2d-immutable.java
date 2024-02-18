class NumMatrix {
    int[][] prefixSumArr;
    public NumMatrix(int[][] matrix) {
        int row = 0, col = 0;
        if (matrix.length != 0) {
            row = matrix.length;
            col = matrix[0].length;
        }
        prefixSumArr = new int[row + 1][col + 1];
        for (int i = 1; i < prefixSumArr.length; i++) {
            for (int j = 1; j < prefixSumArr[0].length; j++) {
                prefixSumArr[i][j] = prefixSumArr[i - 1][j] + prefixSumArr[i][j - 1] + matrix[i - 1][j - 1]
                        - prefixSumArr[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        return prefixSumArr[row2][col2] - prefixSumArr[row1 - 1][col2]
                - prefixSumArr[row2][col1 - 1] + prefixSumArr[row1 - 1][col1 - 1];
    }
}

/*
 * Time complexity construction O(n*m)
 * Time complexity of sumRegion O(1)
 * Space complexity is O(n*m)
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */