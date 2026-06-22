class Solution {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min =Integer.MAX_VALUE; 
        // int c=0;
        String s = "balloon";
        for(char c: s.toCharArray()){
            if(c =='l' || c=='o' ){
                    min=Math.min(min,map.getOrDefault(c,0)/2);
            }else{
                min = Math.min(min,map.getOrDefault(c,0));
            }
        }
        return min;
        
    }
}