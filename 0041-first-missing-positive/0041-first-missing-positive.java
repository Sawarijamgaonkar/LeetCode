class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=set.size()+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}