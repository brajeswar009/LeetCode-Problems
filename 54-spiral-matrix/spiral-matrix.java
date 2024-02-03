class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        // top row means 1-5 here since row will remain same so 0
        int topRow = 0;
        // bottom row (10-14)
        int bottomRow = rowLen - 1;
        // right column(6-9) is last column so to get that total column length -1
        int rightCol = colLen - 1;
        // left col (15-18) col value will remain same only row value will change
        int leftCol = 0;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            // for printing 1st row except last element
            for (int col = leftCol; col <= rightCol; col++) {
                res.add(matrix[topRow][col]);
            }
            topRow++;
            
            // for printing last col except last element
            for (int row = topRow; row <= bottomRow; row++) {
                res.add(matrix[row][rightCol]);
            }
            rightCol--;

            // for printing last row in reverse order except first element from left
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    res.add(matrix[bottomRow][col]);
                }
                bottomRow--;
            }

            // for printing 1st col in reverse order except the 0,0 element
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    res.add(matrix[row][leftCol]);
                }
                leftCol++;
            }
            // since outer boundry is traversed, to traverse the inner matrix changing the
            // matrix size by incrementing top and left
            // and decrementing bottom and right
        }
        return res;
    }
}