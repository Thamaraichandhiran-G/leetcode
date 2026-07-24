class Solution {
    public boolean canAliceWin(int[] arr) {
        int sum1 =Arrays.stream(arr).filter(x->x<=9).sum();
        int sum2 =Arrays.stream(arr).filter(x->x>9).sum();
        
        return !(sum1==sum2);
    }
}