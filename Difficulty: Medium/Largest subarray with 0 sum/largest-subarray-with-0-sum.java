class Solution {
    int maxLength(int arr[]) {
        // code here
        int len=0;
        int psum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(psum==0) len=Math.max(len,i+1);
            else if(hm.containsKey(psum))
                len=Math.max(len,i-hm.get(psum));
            else hm.put(psum,i);
        }
        return len;
    }
}