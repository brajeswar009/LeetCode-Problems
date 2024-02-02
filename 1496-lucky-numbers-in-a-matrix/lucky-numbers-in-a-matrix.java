class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, minIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            // checking col
            boolean isBig = true;
            for (int k2 = 0; k2 < matrix.length; k2++) {
                if (matrix[i][minIndex] < matrix[k2][minIndex]) {
                    isBig = false;
                    break;
                }
            }
            if (isBig)
                res.add(matrix[i][minIndex]);
        }
        return res;
    }
}