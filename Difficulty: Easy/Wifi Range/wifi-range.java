class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        int n = s.length();

        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, (int)-1e9);
        Arrays.fill(right, (int)1e9);

        int last = (int)-1e9;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                last = i;
            }
            left[i] = last;
        }

        last = (int)1e9;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                last = i;
            }
            right[i] = last;
        }

        for (int i = 0; i < n; i++) {
            if (Math.abs(i - left[i]) > x && Math.abs(i - right[i]) > x) {
                return false;
            }
        }

        return true;
    }
}