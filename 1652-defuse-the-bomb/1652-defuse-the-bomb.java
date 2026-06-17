class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int [] res = new int[n];
        if(k==0){
            return res;
        }
        if(k<0){
            int l =0, r = n-1;

            while(l<r){
                int t = arr[r];
                arr[r]= arr[l];
                arr[l]= t;
                l++;
                r--;
            }
        }
        for(int i=0;i<n;i++){
            int t= k;
            int st=i+1;
            int sum=0;
                if(k<0){
                    t=-t;
                    st=n-i;
                }
                while(t!=0){
                    sum+=arr[st%n];
                    st++;
                    t--;
                }
            res[i]=sum;
            
        }
        return res;
    }
}