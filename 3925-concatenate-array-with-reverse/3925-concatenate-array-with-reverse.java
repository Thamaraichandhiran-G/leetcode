class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int arr[]=  new int[n+n];

        List<Integer> ls  = Arrays.stream(nums).boxed().toList();
		ls = ls.reversed();

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]= ls.get(i);
        }
        return arr;
    }
}