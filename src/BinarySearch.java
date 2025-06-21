public class BinarySearch {
    int[] nums;
    int target;

    public BinarySearch(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }

    public int search(){
        int length = nums.length;
        int start = 0, end = length-1;
        int mid;
        int steps = 0;
        while(start <= end){
            steps++;
            mid = (start + end)/2;
            if (nums[mid] == target){
                System.out.println("\nSteps taken by Binear search : " + steps);
                return mid;
            } else if (nums[mid]<target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        System.out.println("\nSteps taken by Binear search : " + steps);
        return -1;
    }
}
