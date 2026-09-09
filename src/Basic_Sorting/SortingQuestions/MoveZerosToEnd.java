package Basic_Sorting.SortingQuestions;

public class MoveZerosToEnd {
    // Move all zeros to end
    static void main() {
        int [] arr={1,0,1,-2,3,0,4,8,0,10,0,12};
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int swaps =0;
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if (swaps==0)break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
