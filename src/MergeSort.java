//import java.util.Random;
//
//public class MergeSort {
//
//    public static void main(String[] args){
//
//        Random random = new Random();
//        int[] array = new int[10];
//
//        for(int i = 0; i < array.length; i++) array[i] = random.nextInt(10000);
//
//        System.out.println("Before:");
//        printArray(array);
//
//        mergeSort(array);
//
//        System.out.println("After");
//        printArray(array);
//    } // end main
//
//    private static void printArray(int[] arr) {  for(int i : arr) System.out.println(i); }
//
//    private static void mergeSort(int[] inputArray){
//        int length = inputArray.length;
//
//        // if one element or no elements
//        if(length < 2){
//            return;
//        }
//
//        int midIndex = length/2;
//        int[] leftArray = new int[midIndex];
//        int[] rightArray = new int[length - midIndex];
//
//        for(int i = 0; i < midIndex; i++) leftArray[i] = inputArray[i];
//
//        for(int i = midIndex; i < length; i++) rightArray[i-midIndex] = inputArray[i];
//
//        // partition
//        mergeSort(leftArray);
//        mergeSort(rightArray);
//
//        // merge
//        merge(inputArray, leftArray, rightArray);
//
//    } // end mergeSort
//
//
//    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
//        int leftSize = leftArray.length;
//        int rightSize = rightArray.length;
//
//        int i = 0, j = 0, k = 0;
//
//        while(i < leftSize && j < rightSize){
//            if(leftArray[i] <= rightArray[j]){
//                inputArray[k] = leftArray[i];
//                i++;
//            }
//            else{
//                inputArray[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//        // If done sorting, and we still have elements in either of the arrays, then
//
//        while(i < leftSize){
//            inputArray[k] = leftArray[i];
//            i++;
//            k++;
//        }
//
//        while(j < rightSize){
//            inputArray[k] = rightArray[j];
//            k++;
//            j++;
//        }
//
//    } // end merge
//
//} // end class
