class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        if (n < 3)
            return new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int prevFirst = Integer.MAX_VALUE;

        // Iterating through the array
        for (int i = 0; i < n; i++) {
            int x = arr[i];

            // Updating first and second smallest numbers
            if (x <= first) {
                first = x;
            } else if (x <= second) {
                second = x;
                prevFirst = first;
            }
            // If a third number greater than first and second is found
            else {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(prevFirst);
                al.add(second);
                al.add(x);
                return al;
            }
        }
        return new ArrayList<>();
    }
}