class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        Map<Integer, ArrayList<Integer>> indexMap = 
                                            new HashMap<>();

        // store all indices of each value in the map
        for (int i = 0; i < arr.length; i++) {
            indexMap.putIfAbsent(arr[i], new ArrayList<>());
            indexMap.get(arr[i]).add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // process each query
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int x = q[2];

            // if x does not exist in map, frequency is 0
            if (!indexMap.containsKey(x)) {
                result.add(0);
                continue;
            }

            ArrayList<Integer> ind = indexMap.get(x);

            // count occurrences between l and r 
            // using binary search
            int left = 
                Collections.binarySearch(ind, l);
            int right = 
                Collections.binarySearch(ind, r + 1);

            if (left < 0) left = -(left + 1);
            if (right < 0) right = -(right + 1);

            // number of occurrences is difference 
            // of bounds
            result.add(right - left);
        }

        return result;
    }
}