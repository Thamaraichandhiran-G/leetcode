class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums1){
            set.add(a);
        }
        ArrayList<Integer> ls = new ArrayList<>();

        for(int a : set){
            if(Arrays.stream(nums2).anyMatch(x->x==a)){
                ls.add(a);
            }
        }
        int arr[]= ls.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}