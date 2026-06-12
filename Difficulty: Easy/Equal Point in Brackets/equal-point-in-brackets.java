class Solution {
    public int findIndex(String s) {
        // code here
        int n = s.length();
        int openCnt = 0, closeCnt = 0;

        // Count total closing brackets
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ')')
                closeCnt++;
        }

        for (int i = 0; i <= n; i++) {

            // Equal point found
            if (openCnt == closeCnt)
                return i;

            if (i < n) {

                // Count opening brackets before next index
                if (s.charAt(i) == '(')
                    openCnt++;

                // Count closing brackets from next index onward
                if (s.charAt(i) == ')')
                    closeCnt--;
            }
        }

        return -1;
    }
}