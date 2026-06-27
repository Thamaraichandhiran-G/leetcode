class Solution {
    public boolean canConstruct(String r, String m) {
        
        if(m.length()<r.length()){
            return false;
        }
        int arr[]= new int[26];

        for(char c: m.toCharArray()){
            arr[c-'a']++;
        }
        
        for(char c: r.toCharArray()){
            arr[c-'a']--;
            if(arr[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}