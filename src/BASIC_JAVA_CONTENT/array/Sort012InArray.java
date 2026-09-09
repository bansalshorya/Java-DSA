package BASIC_JAVA_CONTENT.array;

public class Sort012InArray {
    static void main() {
        int[] arr={0,1,2,1,1,0,2};
        int low=0,mid=0,high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


}
