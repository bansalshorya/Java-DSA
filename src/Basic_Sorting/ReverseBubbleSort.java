package Basic_Sorting;

public class ReverseBubbleSort {
    // Sort an array in descending order using bubble sort
    static void main() {
        int[] arr={1,2,2,6,-3,1,4};
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int swaps=0;
            for (int j = 0; j <n-1 ; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swaps++;
                }
            }
            if (swaps==0)break;
        }
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
}
