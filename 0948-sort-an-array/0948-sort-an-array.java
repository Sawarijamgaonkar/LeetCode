class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=(nums.length/2)-1;i>=0;i--){
            heapify(nums,nums.length,i);
        }
        for(int i=nums.length-1;i>0;i--){
            swap(nums,0,i);
            heapify(nums,i,0);
        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void heapify(int[] arr, int length,int index){
        int max=index;
        int left=2*index +1;
        int right=2*index+2;
        if(left<length && arr[left]>arr[max]){
            max=left;
        }
        if(right<length && arr[right]>arr[max]){
            max=right;
        }
        if(max!=index){
            swap(arr,max,index);
            heapify(arr,length,max);
        }

    }
}