class Solution {
    public int numberOfSpecialChars(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				if(s.contains(String.valueOf((char)(c-32)))){
					map.put(c, 1);
				}
			}
		}
        return map.size();
    }
}