class Solution {
    public int maxProduct(int[] nums) {
        int fm =-1;
        int sm = -1;

        for(int i=0;i<nums.length;i++){
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