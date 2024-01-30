class Solution {
    public int[] replaceElements(int[] arr) {
        int temp[] = new int[arr.length];
        int max;
        if (arr.length == 1)
            temp[0] = -1;
        else {
            for (int i = 0; i < arr.length; i++) {
                max = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                if (max != 0)
                    temp[i] = max;
            }
            temp[temp.length - 1] = -1;
        }
        return temp;
    }
}