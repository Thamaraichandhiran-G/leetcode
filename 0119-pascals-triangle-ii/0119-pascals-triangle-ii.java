class Solution {
    public List<Integer> getRow(int n) {
        n++;
        List<List<Integer>> ls  = new ArrayList<>();

        for(int i=1;i<=n;i++ ){
            List<Integer> arr = new ArrayList<>();
            for(int a=1;a<=i;a++){
                if(a==i || a==1){
                    arr.add(1);
                    continue;
                }
                arr.add((ls.get(i-2).get(a-2))+(ls.get(i-2).get(a-1)));
            }

            ls.add(arr);
        }
        return ls.get(n-1);
    }
}