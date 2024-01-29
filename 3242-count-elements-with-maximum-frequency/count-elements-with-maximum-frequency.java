class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // filling the hashmap with number and their count by using getOrDefault
        // which will return the value of the given key, if the key comes for first time
        // then value will be 1, if it repeats then previous value +1
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // using stream() to convert the collection to stream and using max() of stream
        // class to find maximum in the values.
        // compare() method of Interger class to compare values
        maxCount = map.values().stream().max(Integer::compare).get();
        System.out.println(maxCount);
        int count = 0;
        for (int i : map.values()) {
            if (i == maxCount)
                count++;
        }
        return count * maxCount;
    }
}