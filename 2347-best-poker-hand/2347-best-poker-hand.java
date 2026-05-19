class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Map<Integer,Integer> rk = new HashMap<>();
        Map<Character,Integer> su = new HashMap<>();

        for(int  i: ranks){
            rk.put(i,rk.getOrDefault(i,0)+1);
        }
        System.out.println(rk);
        for(char c: suits){
            su.put(c,su.getOrDefault(c,0)+1);
        }
        if(5==su.get(suits[0])) return "Flush";

    //    for(int j : rk.values()){
    //         if(j>=3){
    //             return "Three of a Kind";
    //         }
    //     }
    //     for(int j : rk.values()){
    //         if(j>=2){
    //             return "Pair";
    //         }
    //     }
        int max = Collections.max(rk.values());
        if(max>=3){
            return "Three of a Kind";
        }
        else if( max ==2 ){
            return "Pair";
        }
        else{
            return "High Card";
        }
    }
}