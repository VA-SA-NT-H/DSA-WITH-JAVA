public class Main {
    public static void main(String[] args) {
        int numsForSearching[] = {12,34,45,56,67,78,89,90,93,94,96,98,112,134,135,178,190,300,458,459,500,501,502,503,504,505,506,507};
//        int[] nums = new int[1000000];
        int target = 505;

        int[] numsForSorting = {45,3,56,342,78,75,67,89,54,32,11,23};

        LinearSearch linearSearch = new LinearSearch(numsForSearching, target);
        int lsresult = linearSearch.search();
        System.out.println("(LINEAR SEARCH) Index position : "+ lsresult);

        BinarySearch binarySearch = new BinarySearch(numsForSearching, target);
        int bsresult = binarySearch.search();
        System.out.println("(BINARY SEARCH) Index position : "+ bsresult);

        BubbleSort bubbleSort = new BubbleSort(numsForSorting);
        int[] bsortresult = bubbleSort.sort();
        System.out.println("\n(BUBBLE SORT) Sorted array : ");
        for(int num: bsortresult){
            System.out.print(num+" ");
        }

    }
}