class Solution {
    public boolean wordPattern(String pat, String s) {
        
        s = s.trim();

        String[] str = s.split(" ");
        

        HashMap<Character,String> map  = new HashMap<>();
        int n = pat.length();
        if(n!=str.length){
            return false;
        }

        for(int i=0;i<n;i++){
            char a = pat.charAt(i);
            String b =str[i];
            System.out.println(b.toString());
            if(map.containsKey(a)){
                if(!b.equals(map.get(a))){
                    return false;
                }
            }else{
                if(map.values().contains(b)){
                    return false;
                }
                map.put(a,b);
            }
        }
        return true;
    }
}