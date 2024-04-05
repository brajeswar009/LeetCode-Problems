class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        // to get the max element of array to set as right limit for binary search
        for (int i = 1; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        // right is highest element of array because Koko definetly can
        // eat all bananas in the highest speed which is max element of array
        int left = 1, right = max;

        while (left < right) {
            // can eat mid number of bananas per hour
            int mid = left + (right - left) / 2;

            // if finished all piles in that given hour then no need to check
            // further because if it can be finished with mid speed then it can be finished
            // with mid +1 speed also but since we need min eating speed so discarding all
            // other values next to mid setting right as mid
            if (canEatAll(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static boolean canEatAll(int piles[], int mid, int h) {
        int actualHour = 0;
        //checking for each hour a pile completed or not
        for (int i : piles) {
            actualHour += i / mid;

            if (i % mid != 0) {
                actualHour++;
            }
        }
        // if acutal hour less than given hour send true otherwise 
        // Koko will get caught
        return actualHour <= h;
    }
}