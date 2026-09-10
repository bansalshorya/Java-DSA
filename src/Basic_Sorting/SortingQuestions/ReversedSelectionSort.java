package SortingQuestions;

public class ReversedSelectionSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr={1,2,0,-1,43,5};
        print(arr);
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int max=Integer.MIN_VALUE,idx=0;
            for (int j = i; j <n ; j++) {
                if (arr[j]>max){
                    max=arr[j];
                    idx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        print(arr);
    }
}
