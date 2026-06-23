class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int cnt = 0;
        int i = 1;

        // Defeat people while enough strength remains
        while (i * i <= p) {
            p -= i * i;
            cnt++;
            i++;
        }

        return cnt;
    }
};