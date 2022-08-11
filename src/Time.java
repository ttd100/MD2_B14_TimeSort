
import java.util.Arrays;

public class Time {
    public static void main(String args[]) {

        int[] arr = {3,4,9,2,8,7,1,5,11,67,22,33,1231244,22,45,12,55,41,52,662,12,59,31,33,4123,41314,555123,79};
        int[] arr1 = {3,4,9,2,8,7,1,5,11,67,22,33,1231244,22,45,12,55,41,52,662,12,59,31,33,4123,41314,555123,79};
        int[] arr2 = {3,4,9,2,8,7,1,5,11,67,22,33,1231244,22,45,12,55,41,52,662,12,59,31,33,4123,41314,555123,79};
        long start1 = System.nanoTime();
        bubbleSort(arr);
        long end1 = System.nanoTime();
        System.out.println("=====bubbleSort======");
        System.out.println(Arrays.toString(arr));
        System.out.println("Time ==="+(end1 - start1));
        long start2 = System.nanoTime();
        selectionSort(arr1);
        long end2 = System.nanoTime();
        System.out.println("=====selectSort======");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Time ==="+(end2 - start2));
        long start3 = System.nanoTime();
        insertionSort(arr2);
        long end3 = System.nanoTime();
        System.out.println("=====insertSort======");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Time ==="+(end3 - start3));

    }
    // ==== bubble Sort========
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    // ===== chen ==========
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void selectionSort (int arr[]){

        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = arr[i];

            int minindex = i;

            for (int j = i + 1; j < arr.length; j++) {


                if (minValue > arr[j]) {
                    minValue = arr[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                int temp = arr[i];
                arr[i] = minValue;
                arr[minindex] = temp;
            }

        }
    }

}