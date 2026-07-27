class Solution {
    public int maximumProduct(int[] nums) {
        // int  fm = -1000;
        // int sm = -1000;
        // int tm = -1000;

        // for(int i=0;i<nums.length;i++){
        //     if(fm<=nums[i]){
        //         tm = sm;
        //         sm = fm;
        //         fm = nums[i];
        //     }
        //     else if(sm<=nums[i]){
        //         tm = sm;
        //         sm = nums[i];
        //     }
        //     else if( tm <=nums[i]){
        //         tm = nums[i];
        //     }
        // }

        // return fm*sm*tm;
        Arrays.sort(nums);
        int n=nums.length;
        int nmax=nums[n-1]*nums[0]*nums[1];
        int pmax=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(nmax, pmax);
    }
}