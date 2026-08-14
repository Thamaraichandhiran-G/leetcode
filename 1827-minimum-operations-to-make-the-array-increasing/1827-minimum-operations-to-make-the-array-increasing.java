class Solution {
    public int minOperations(int[] arr) {

        int c=0;

        for(int i=1;i<arr.length;i++){
            while(arr[i]<=arr[i-1]){
                arr[i]++;
                c++;
            }
        }
        return c;
    }
}