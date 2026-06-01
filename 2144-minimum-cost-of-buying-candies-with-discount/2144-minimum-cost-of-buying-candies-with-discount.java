class Solution {
    public int minimumCost(int[] arr) {
        
        Arrays.sort(arr);


        int c=0;

        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(n==2){
            c=arr[0]+arr[1];
            return c;
        }
        int i=n-1;
        for(i=n-1;i>=0;i=i=i-3){
            c+=arr[i];
            if(i==0){
                return c;
            }
            c+=arr[i-1];
            if(i==0){
                return c;
            }
        }
        return c;
    }
}