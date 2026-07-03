class Solution {
    public int secondHighest(String s) {
        s=s.replaceAll("[^0-9]","");

        // System.out.println(s);

        
        int n = s.length();
        if(n==0){
            return -1;
        }
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= s.charAt(i)-'0';
        }
        // System.out.println(Arrays.toString(arr));

        int max = Arrays.stream(arr).max().getAsInt();
        // System.out.println(max);
        int smax=-1;
        for(int i=0;i<n;i++){
            if(smax<arr[i] && arr[i]!=max){
                smax=arr[i];
            }
        }
        return smax==-1?-1:smax;
    }
}