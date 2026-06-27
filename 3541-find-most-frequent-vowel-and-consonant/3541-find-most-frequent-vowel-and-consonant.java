class Solution {
    public int maxFreqSum(String s) {
        int maxv=0, maxc=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: map.keySet()){
            if("aeiou".indexOf(c)<0){
                maxv= Math.max(maxv,map.get(c));
            }else{
                maxc= Math.max(maxc,map.get(c));
            }
        }
        return maxv+maxc;
    }
}