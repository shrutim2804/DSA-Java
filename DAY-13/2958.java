class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int l=0;
        int len=0;
        for(int r=0;r<nums.length;r++){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.get(nums[r])>k){
             m.put(nums[l],m.getOrDefault(nums[l],0)-1);
             l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}
