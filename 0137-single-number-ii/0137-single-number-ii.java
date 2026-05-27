class Solution {
    public int singleNumber(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(var a: map.entrySet()){
            if(a.getValue()==1){
                return a.getKey();
            }
        }
        return -1;
    }
}