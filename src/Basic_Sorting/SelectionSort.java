package Basic_Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,-1,43,5};
        print(arr);
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min= Integer.MAX_VALUE ,idx=0;
            for (int j = i; j <n ; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }



//        for (int i = 0; i < n-1; i++) {
//            int min=Integer.MIN_VALUE,idx=0;
//            for (int j = i; j < n; j++) {
//                if (arr[j]>min){
//                    min=arr[j];
//                    idx=j;
//                }
//            }
//            int temp=arr[idx];
//            arr[idx]=arr[i];
//            arr[i]=temp;
//        }
        print(arr);
    }
}
