package Basic_Sorting;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr={1,3,2,12,4,5,7};
        int k=6;
        for (int i = 0; i <=k ; i++) {
            int min= Integer.MAX_VALUE,idx=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            int temp=min;
            min= arr[i];
            arr[i]=temp;
        }
        System.out.println(arr[k]);
    }
}
