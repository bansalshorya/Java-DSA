package Basic_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,2,6,8,-1,1,0,4};
        int n= arr.length;
        for (int i = 1; i <n; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
