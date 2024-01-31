class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> valuSet = new HashSet<>();
        for (Integer val : map.values()) {
            if (!valuSet.add(val))
                return false;
        }
        return true;
    }
}