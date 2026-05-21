class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max=0;
        Set<Character> ls  = new HashSet<>();

        int l=0;
        for(int r=0;r<n;r++){
            while(ls.contains(s.charAt(r))){
                ls.remove(s.charAt(l));
                l++;
            }
            ls.add(s.charAt(r));
            max = Math.max(max,r-l+1);
        }

        return max;
    }
}