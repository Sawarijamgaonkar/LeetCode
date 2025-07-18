class Solution {
    // heap sort: 805ms, beats 5%:  
    // public int findKthLargest(int[] nums,int k) {
    //     for(int i=(nums.length/2)-1;i>=0;i--){
    //         heapify(nums,nums.length,i);
    //     }
    //     for(int i=nums.length-1;i>0;i--){
    //         swap(nums,0,i);
    //         heapify(nums,i,0);
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         System.out.println(nums[i]+" ");
    //     }
    //     return nums[nums.length-k];
    // }
    // public static void swap(int[] arr, int i, int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
    // public static void heapify(int[] arr, int length,int index){
    //     int max=index;
    //     int left=2*index +1;
    //     int right=2*index+2;
    //     if(left<length && arr[left]>arr[max]){
    //         max=left;
    //     }
    //     if(right<length && arr[right]>arr[max]){
    //         max=right;
    //     }
    //     if(max!=index){
    //         swap(arr,max,index);
    //         heapify(arr,length,max);
    //     }
    // }

    // 23ms and beats 83.69%: 
    // public int findKthLargest(int[] nums,int k) {
    //     Arrays.sort(nums);
    //     return nums[nums.length-k];
    // }
    public int findKthLargest(int[] nums,int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
