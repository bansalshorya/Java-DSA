package Basic_Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-1,2,6,2,9,3,7,0};
        int n= arr.length;
        print(arr);
        for (int k = 0; k <n-1 ; k++) {
            int swap=0;
            for (int i = 0; i < n-1-k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;
                }
            }
            if (swap==0) break;
        }
        print(arr);
    }
}
