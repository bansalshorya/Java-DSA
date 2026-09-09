package BASIC_JAVA_CONTENT.array;
import java.util.Scanner;
public class MissingNoInArray {
    public static void main(String[] args){
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size= sc.nextInt();
        System.out.print("Enter all elements: ");
        int[] arr = new int[size-1];
        for (int i = 0; i <size-1 ; i++) {
            arr[i] = sc.nextInt();
            result+=arr[i];
        }
        System.out.print("Entered Array: ");
        for (int i = 0; i <size-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        result=((size)*(size+1)/2)-result;
        System.out.println(result);
    }
}
