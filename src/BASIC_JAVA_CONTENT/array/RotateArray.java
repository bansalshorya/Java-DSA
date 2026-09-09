package BASIC_JAVA_CONTENT.array;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size= sc.nextInt();
        System.out.print("Enter all elements: ");
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered Array: ");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the rotation: ");
        int r= sc.nextInt();
        r=r%size;

        ReverseArray(0,r-1,arr);
        ReverseArray(r,size-1,arr);
        ReverseArray(0,size-1,arr);
        System.out.print("Rotated Array: ");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void ReverseArray(int i,int j,int[] arr){
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;j--;
        }
    }
}
