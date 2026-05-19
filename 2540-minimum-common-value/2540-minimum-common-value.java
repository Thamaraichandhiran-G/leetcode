class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // List<Integer> ls = Arrays.stream(nums2).boxed().toList();
        // for(int i=0;i<nums1.length;i++){
        //     if(ls.contains(nums1[i])){
        //         return nums1[i];
        //     }
        // }
        // return -1;


        Set<Integer> s1 = Arrays.stream(nums1)
                        .boxed()
                        .collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2)
                        .boxed()
                        .collect(Collectors.toSet());

        s1.retainAll(s2);
        if(s1.isEmpty()){
            return -1;
        }else{
            return Collections.min(s1);
        }
    }
}