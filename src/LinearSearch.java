public class LinearSearch {
    int[] nums;
    int target;
    public LinearSearch(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }
    public int search(){
        int length = nums.length;
        int steps = 0;
        for(int i=0;i<length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("\nSteps taken by linear search : " + steps);
                return i;
            }
        }
        System.out.println("\nSteps taken by linear search : " + steps);
        return -1;
    }
}
