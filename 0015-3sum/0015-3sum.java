class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&& nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if((nums[i]+nums[j]+nums[k])==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[j]==nums[k+1]){
                        k--;
                    }
                }
                else if((nums[i]+nums[j]+nums[k])>0){
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        return result;
    }
}