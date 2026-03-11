class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr) hs.add(i*i);
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]*arr[i]+arr[j]*arr[j];
                if(hs.contains(sum)) return true;
            }
        }
        return false;
    }
}