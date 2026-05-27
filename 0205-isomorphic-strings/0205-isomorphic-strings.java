class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map  = new HashMap<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a)!=b){
                    return false;
                }
            }else{
                if(map.values().contains(b)){
                    return false;
                }
                map.put(a,b);
            }
        }
        System.out.println(map);
        return true;
    }
}