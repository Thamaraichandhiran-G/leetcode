class Solution {
    public int missingInteger(int[] arr) {
        int ans =arr[0];
        int n = arr.length;
        if(n==1){
            return ans+1;
        }
        int i;
        for(i=1;i<n;i++){
            if(arr[i-1]+1==arr[i]){
                ans+=arr[i];
            }else{
                break;
            }
        }
        while(true){
            boolean f = false;
            for(int a = 0 ;a<n;a++){
                if(arr[a]==ans){
                    ans++;
                    f = true;
                    break;
                }
            }
            if(!f){
                return ans;
            }
        }
    }
}