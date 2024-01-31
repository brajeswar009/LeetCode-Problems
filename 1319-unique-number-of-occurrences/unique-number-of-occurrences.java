class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int countHolder[] = new int[arr.length];
        Arrays.sort(arr);
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            countHolder[idx++] = count;
        }
        Arrays.sort(countHolder);
        // System.out.println(Arrays.toString(countHolder));
        int x = 0;
        while (countHolder[x] == 0) {
            x++;
        }
        for (int i = x + 1; i < countHolder.length; i++) {
            if (countHolder[i] == countHolder[i - 1])
                return false;
        }
        return true;
    }
}