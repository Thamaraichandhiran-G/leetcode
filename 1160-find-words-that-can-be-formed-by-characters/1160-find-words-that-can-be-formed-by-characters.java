class Solution {
    public boolean isContains(String s , int freq[]){
        for(char c : s.toCharArray()){
            if(freq[c-'a']==0){
                return false;
            }
            freq[c-'a']--;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        
        int freq[] = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c-'a']++;
        }

        int len=0;

        for(String s : words){
            if(isContains(s,freq.clone())){
                len+=s.length();
            }
        }
        return len;
    }
}