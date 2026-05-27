class Solution {
    public int singleNumber(int[] arr) {
        
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int a : arr){
        //     map.put(a,map.getOrDefault(a,0)+1);
        // }

        // for(var a: map.entrySet()){
        //     if(a.getValue()==1){
        //         return a.getKey();
        //     }
        // }
        // return -1;

        int n = arr.length;
        // int ans=0;
        // int c=0;
        // for(int i=0;i<32;i++){
        //     c=0;
        //     for(int j=0;j<n;j++){
        //         c+= arr[j] & 1;
        //         arr[j]= arr[j]>>1;
        //     }
        //     if(c%3==1){
        //         ans=ans|(1<<i);
        //     }
        // }
        // return ans;

        if(n<=3){
            return arr[0];
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=1;i<n;i+=3){
            if(arr[i-1]==arr[i]){
                continue;
            }
            else{
                return arr[i-1];
            }
        }
        return arr[n-1];
    }
}