class Solution {
    public int heightChecker(int[] h) {
        int arr[] = h.clone();
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<h.length;i++){
            if(h[i]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}