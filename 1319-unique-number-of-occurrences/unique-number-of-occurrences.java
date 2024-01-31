class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> valueSet = new HashSet<>();
        for(int x: map.values()){
            valueSet.add(x);
        }
        return map.size() == valueSet.size();
    }
}