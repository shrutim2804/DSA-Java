Leetcode qs-3731

_____________________________________________________________________________________________________________________________________________________

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        List<Integer> m=new ArrayList<>();
        Arrays.sort(nums);
        int l=nums[0];
        int h=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=l+1;i<h;i++){
            if(!s.contains(i)){
                m.add(i);
            }
        }
    return m;
    }
}
