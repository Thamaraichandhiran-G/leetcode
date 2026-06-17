class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int [] res = new int[n];
        if(k==0){
            return res;
        }
        for(int i=0;i<n;i++){
            int t= k;
            int st=i;
            int sum=0;
            if(k>0){
                st++;
                while(t!=0){
                    sum+=arr[st%n];
                    st++;
                    t--;
                }
                
            }else{
                t=-t;
                st=n-st;
                while(t!=0){
                    sum+=arr[n-(st%n)-1];
                    st++;
                    t--;
                }
                
            }
            res[i]=sum;
            
        }
        return res;
    }
}