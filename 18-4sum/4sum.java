class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result=new ArrayList<>();
        if(target>Integer.MAX_VALUE||target<Integer.MIN_VALUE){
            return result;
        }
        if(nums.length<4){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1; int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[left]+nums[right]+nums[j];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
                
            }
        }
        return result;
        
    }
}