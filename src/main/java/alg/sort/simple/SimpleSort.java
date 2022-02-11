package alg.sort.simple;

public class SimpleSort {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 5, 22, 9, 1, 4, 19};
        print(arr);
        PancakeSort.sort(arr, arr.length);
        System.out.println();
        print(arr);
    }
}
