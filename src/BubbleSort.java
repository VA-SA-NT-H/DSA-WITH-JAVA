public class BubbleSort {
    int temp=0;
    int[] nums;

    public BubbleSort(int[] nums){
        this.nums = nums;
    }
    public int[] sort(){
        int length = nums.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
