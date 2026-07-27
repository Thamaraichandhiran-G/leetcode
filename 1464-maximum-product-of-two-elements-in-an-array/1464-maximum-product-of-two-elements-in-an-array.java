class Solution {
    public int maxProduct(int[] nums) {
        int fm =-1;
        int sm = -1;

        int n = nums.length;

        for(int i=0;i<n;i++){
            if(fm<=nums[i]){
                sm = fm;
                fm = nums[i];
            }else if( sm <=nums[i]){
                sm = nums[i];
            }
        }
        return (fm-1)*(sm-1);
    }
}