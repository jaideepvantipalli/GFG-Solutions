// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> a=new LinkedHashSet<>();
        for(int i:arr){
            a.add(i);
        }
        return new ArrayList<>(a);
    }
}