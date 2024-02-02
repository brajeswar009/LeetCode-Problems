class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int minInRow[] = new int[rowLen];
        int maxInCol[] = new int[colLen];

        //finding min element in of each row
        for (int i = 0; i < rowLen; i++) {
            int min = Integer.MAX_VALUE; 
            for (int j = 0; j < colLen; j++) {
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            minInRow[i] = min;
        }
        //finding max element in of each col
        for (int j = 0; j < colLen; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rowLen; i++) {
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            maxInCol[j] = max;
        }
        // checking the common element in minInRow, maxInCol array with the matrix
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if(matrix[i][j] == minInRow[i] && maxInCol[j]==matrix[i][j]){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}