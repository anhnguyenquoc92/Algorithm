package alg.sort;

public class SingleSort {

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int minIdx = 0;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int temp;
        int it;
        for (int i = 1; i < arr.length; i++) {
            it = i;
            while (it > 0) {
                if (arr[it] < arr[it - 1]) {
                    temp = arr[it];
                    arr[it] = arr[it - 1];
                    arr[it - 1] = temp;
                }
                it--;
            }
        }
    }

    public static void countingSort(int[] arr) {

    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 5, 22, 9, 1, 4, 19};
        print(arr);
        insertionSort(arr);
        System.out.println();
        print(arr);
    }
}
