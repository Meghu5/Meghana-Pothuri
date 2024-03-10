package org.example.Algorithms;

public class Binary_Search {
  /*  The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:

    If the key is less than the middle element, then you now need to search only in the first half of the array.
    If the key is greater than the middle element, then you need to search only in the second half of the array.
    If the key is equal to the middle element in the array, then the search ends.
    Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.*/
        public static void main(String args[]){
    Binary_Search b = new Binary_Search();
    int[] arr= {1,2,4,5,2,3};
    int val =binarySearch(arr,1,10,2);
    System.out.println(val);
    System.out.println("Length of array - "+arr.length);
}
    public static int binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;
        System.out.println("Mid val1 "+mid);
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
                System.out.println("Mid val2 "+mid);
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
                System.out.println("Mid val "+mid);
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

}
