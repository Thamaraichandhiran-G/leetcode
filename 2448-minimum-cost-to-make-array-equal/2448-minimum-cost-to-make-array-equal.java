class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;


        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }


        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));

   
        long totalWeight = 0;
        for (int i = 0; i < n; i++) {
            totalWeight += arr[i][1];
        }

      
        long cumulativeWeight = 0;
        long target = 0;
        for (int i = 0; i < n; i++) {
            cumulativeWeight += arr[i][1];
            if (cumulativeWeight >= (totalWeight + 1) / 2) {
                target = arr[i][0];
                break;
            }
        }


        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs((long)nums[i] - target) * (long)cost[i];
        }
        
        return ans;
    }
}