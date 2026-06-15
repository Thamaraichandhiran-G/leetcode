class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Arrays.sort(nums);
        Set<List<Integer>>set=new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            HashSet<Integer> a = new HashSet<>();
            for(int j=i+1;j<n;j++){
                    int tr = -(nums[i]+nums[j]);
                    if(a.contains(tr)){
                        List<Integer>tri=Arrays.asList(nums[i],nums[j],tr);
                        Collections.sort(tri);
                        set.add(tri);
                        // if(set.size()==n/3){
                        //     return new ArrayList<>(set);
                        // }
                    }
                    a.add(nums[j]);  
                }
        }
        return new ArrayList<>(set);
    }
}