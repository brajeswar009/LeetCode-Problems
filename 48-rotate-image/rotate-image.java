class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;

        while (left < right) {
            for (int i = 0; i < right-left; i++) {

                int top = left;
                int bottom = right;

                //save the top left in a temp variable
                int topLeft = matrix[top][left + i];
                
                //move bottom left to top left
                matrix[top][left + i] = matrix[bottom - i][left];

                // move bottom right to bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                //move top right to bottom right
                matrix[bottom][right - i] = matrix[top + i][right];

                ///move top left to top right
                matrix[top + i][right] = topLeft;
            }
            // shifting the boundary to traverse inner boundary after the outer one swapped
            left++;
            right--;
        }

    }
}

/*
* Logic to solve:
 * if we traverse clockwise and first try swapping each corner of the square then
 * we would be required to create multiple temp variables to store numbers before
 * swapping so an easier approach will be to traverse anti-clockwise and store
 * top left in a temp variable and fill the empty space subsequently.
 * To set the boundary, we will be setting left, right, top, bottom and as
 * we traverse it will help to reduce the boundary
 * after swapping 4 corners to swap the next elements, 
 * the top left will go 1 step right (top, left+i) [00->01->02 (only col value changes)]
 * top right will go 1 step down (top+i, right)[03->13->23 (only row value changes)].
 * bottom right will go 1 step left (bottom, right-i) [33->32->31 (only col value changes)]
 * bottom left will go 1 step up (bottom-i, left)[30->20->10 (only row value changes)]
 * after completing the loop which traverses till the outer boundary traversed i.e.
 * left = 0, right=matrix.length-1 (0-3,1-2 this indicates outer loop traversed)
 * we will reduce the boundary using the left and right value
 */

// another effiecient approach will be first transpose the matrix to get col value in row
// then we will just reverse the transposed matrix to get desired value

/*
 * Brute Force approach: TC = O(n2), SC = O(n2)
 * for a 4x4 matrix if we analyse the swap index values;
 * 00-03 10-02
 * 01-13 11-12
 * 02-23 12-22
 * 03-33 13-32
 * etc. so if we observe for i,j the swap index is j, last index-i(i.e. len-1-i
 * example for
 * 0th row 4-1-0=3, for 1st row 4-1-1=2 etc.)
 * so just using this logic and putting the value of i,j in the newly created 2d
 * array
 * j, len-1-i position.
 * int len = matrix.length;
 * int ans[][] = new int[len][len];
 * for (int i = 0; i < matrix.length; i++) {
 * for (int j = 0; j < matrix.length; j++) {
 * ans[j][len-1-i] = matrix[i][j];
 * }
 * }
 * for (int i = 0; i < matrix.length; i++) {
 * for (int j = 0; j < matrix.length; j++) {
 * System.out.print(ans[i][j]+" ");
 * }
 * }
 * 
 * 
 */
