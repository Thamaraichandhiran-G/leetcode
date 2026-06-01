class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        while(n!=0)
        {
            int d= n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n/=10;
        }
        for(var a : map.entrySet()){
            sum+=(a.getKey()*a.getValue());
        }
        return sum;
    }
}