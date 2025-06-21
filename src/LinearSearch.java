public class LinearSearch {
    int nums[] = {12,34,45,56,67,78,89,90};
    int target = 67;
    int search(){
        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
