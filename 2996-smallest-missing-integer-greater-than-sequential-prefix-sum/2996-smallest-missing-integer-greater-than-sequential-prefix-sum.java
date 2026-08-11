class Solution {
    public int missingInteger(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(arr[0]);
        int max =0;
        int n = arr.length;
        if(n==1){
            return arr[0]+1;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]+1==arr[i]){
                ls.add(arr[i]);
            }else{
                break;
            }
        }
        List<Integer> num = Arrays.stream(arr)
                           .boxed()
                           .collect(Collectors.toList());
        int sum = 0;
        for(int i=0;i<ls.size();i++){
            sum+=ls.get(i);
        }
        while(true){
            if(num.indexOf(sum)!=-1){
                sum++;
            }else{
                return sum;
            }
        }
    }
}