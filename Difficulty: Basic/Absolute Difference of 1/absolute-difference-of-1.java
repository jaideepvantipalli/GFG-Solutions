// User function Template for Java

class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            int number = arr[i];
            if (number < k && number > 9 && isDifferenceOfOne(number)) {
                result.add(number);
            }
        }
        return result;
    }
    
    private boolean isDifferenceOfOne(int num) {
        int number = num;
        int lastDigit = number%10;
        number = number / 10;
        while (number > 0) {
            int currDigit = number%10;
            if (Math.abs(lastDigit - currDigit) != 1) {
                return false;
            }
            lastDigit = currDigit;
            number = number / 10;
        }
        return true;
    }
}
