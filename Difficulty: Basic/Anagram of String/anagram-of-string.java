/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        HashMap<Character,Integer> map = new HashMap<> ();
        
        
        for(char c :s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(char d :s2.toCharArray())
        {
            map.put(d,map.getOrDefault(d,0)-1);
        }
        int count=0;
       for(Map.Entry<Character,Integer> m : map.entrySet())
       {
           count+=Math.abs(m.getValue());
       }
       return count;
    }
}