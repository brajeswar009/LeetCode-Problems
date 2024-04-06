class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // finding max element and sum of all the elements of weights array
        int maxWeight = weights[0], sumOfWeights = weights[0];
        for (int i = 1; i < weights.length; i++) {
            maxWeight = Math.max(maxWeight, weights[i]);
            sumOfWeights += weights[i];
        }
        // minimum capacity will be max element of array because
        // that will be the least element which can carry other weights
        int minCapacity = maxWeight;

        // sum of all elements will be max capacity because it can carry all
        // weights in 1 day so the ans will lie somewhere in the middle
        int maxCapacity = sumOfWeights;

        while (minCapacity <= maxCapacity) {
            int capacity = minCapacity + (maxCapacity - minCapacity) / 2;

            int numberOfDays = canShip(weights, capacity);
            
            if (numberOfDays <= days) {
                maxCapacity = capacity - 1;
            } 
            else {
                minCapacity = capacity + 1;
            }
        }
        return minCapacity;
    }

    //
    static int canShip(int weights[], int capacity) {
        int days = 1;
        int currentCapacity = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentCapacity + weights[i] > capacity) {
                days++;
                currentCapacity = weights[i];
            } else {
                currentCapacity += weights[i];
            }
        }
        return days;
    }
}