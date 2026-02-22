class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cnt=0;
        int prefixXor=0;
        for(int i:arr){
            prefixXor^=i;
            if(prefixXor==k) cnt++;
            
            int target=prefixXor^k;
            if(hm.containsKey(target)){
                cnt+=hm.get(target);
            }
            hm.put(prefixXor,hm.getOrDefault(prefixXor,0)+1);
        }
        return cnt;
    }
}