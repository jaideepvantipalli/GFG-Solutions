class Solution {
    public String chooseSwap(String s) {
        // code here
        int n = s.length();

        // first[c] = first index where character c appears
        // in s If a character does not appear, its value
        // stays -1.
        int[] first = new int[26];
        Arrays.fill(first, -1);

        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            if (first[ch] == -1) {
                first[ch] = i;
            }
        }

        char x = 0, y = 0;
        int pos = -1;

        // Find the leftmost position that can be made
        // smaller. At that position, choose the smallest
        // possible character that appears later in the
        // string.
        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i) - 'a';

            for (int c = 0; c < cur; c++) {
                // If a smaller character exists after
                // position i, swapping these two characters
                // can improve the string.
                if (first[c] > i) {
                    pos = i;
                    x = s.charAt(i);
                    y = (char)('a' + c);
                    break;
                }
            }

            if (pos != -1) {
                break;
            }
        }

        // If no beneficial swap exists, return the original
        // string.
        if (pos == -1) {
            return s;
        }

        char[] res = s.toCharArray();

        // Swap all occurrences of x and y.
        for (int i = 0; i < n; i++) {
            if (res[i] == x) {
                res[i] = y;
            }
            else if (res[i] == y) {
                res[i] = x;
            }
        }

        return new String(res);
    }
}