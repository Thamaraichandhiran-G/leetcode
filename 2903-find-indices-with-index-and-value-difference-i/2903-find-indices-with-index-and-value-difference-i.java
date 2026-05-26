class Solution {
    public int[] findIndices(int[] arr, int id, int vd) {
        
        int i=0;
        int j=0;
        int n = arr.length;
        int [] res = new int[2];
        Arrays.fill(res,-1);
        while ( i<n && j<n){
            if(Math.abs(i-j)>=id){
                if(Math.abs(arr[i]-arr[j])>=vd){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
            if(j==n-1){
                i++;
                j=0;
                continue;
            }
            j++;
        }
        return res;
    }
}