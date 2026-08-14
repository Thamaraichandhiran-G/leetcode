class Solution {
    public int countTexts(String s) {
        long mod = 1_000_000_007;
        long ans= 1;
        int n = s.length();

        int i=0;

        while(i<n){
            int j = i;

            char ch = s.charAt(i);

            while(j<n && s.charAt(j)==ch){
                j++;
            }

            int len = j-i;

            int maxg = (ch=='7' || ch=='9')? 4 : 3;
            long dp[]=  new long[len+1];
            dp[0]=1;
            for(int k=1;k<=len;k++){
                for(int t =1;t<=maxg && t<=k;t++){
                    dp[k]= (dp[k]+dp[k-t])%mod;
                }
            }
            ans = (ans*dp[len])%mod;
            i=j;
        }
        return (int)ans;
    }
}