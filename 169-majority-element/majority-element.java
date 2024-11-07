class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count+=1;
                if(count>nums.length/2){
                    return nums[i];
                }
            }
            else{
                count=1;
            }
        }
        return 0;
    }
}