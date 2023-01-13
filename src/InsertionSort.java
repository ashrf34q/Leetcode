import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){

        Random random = new Random();
        int[] array = new int[1000];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1000);
        }

        System.out.println("Before:");
        printArray(array);

        insertionSort(array);

        System.out.println("After:");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[] inputArray) {
        for(int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i-1;
            while(j >= 0 && inputArray[j] > currentValue) {
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currentValue;

        }
    }
}
