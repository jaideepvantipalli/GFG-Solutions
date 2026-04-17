class Solution {
    boolean canFormPalindrome(String S) {
        // your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:S.toCharArray()) hm.put(ch,hm.getOrDefault(ch,0)+1);
        int count=0;
        for(char ch:hm.keySet()){
            if(hm.get(ch)%2!=0) count++;
        }
        return count>1?false:true;
    }
}