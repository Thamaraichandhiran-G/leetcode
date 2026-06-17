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
                if(st==n-1){
                    st=0;
                }else{
                    st++;
                }
                while(t!=0 && st<n){
                    sum+=arr[st];
                    st++;
                    t--;
                }
                if(t!=0){
                    st=0;
                }
                while( t!=0 && st<n ){
                    sum+=arr[st];
                    st++;
                    t--;
                }
                
            }else{
                t=-t;

                if(st==0){
                    st=n-1;
                }
                else{
                    st--;
                }

                while(t!=0 && st>=0){
                    sum+=arr[st];
                    st--;
                    t--;
                    
                }
                if(t!=0){
                    st=n-1;
                }
                while(t!=0 && st>=0){
                    sum+=arr[st];
                    st--;
                    t--;
                }
            }
            res[i]=sum;
            
        }
        return res;
    }
}