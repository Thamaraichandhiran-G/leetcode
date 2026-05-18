class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= arr.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}