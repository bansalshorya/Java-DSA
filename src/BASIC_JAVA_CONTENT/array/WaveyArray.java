package BASIC_JAVA_CONTENT.array;

import java.util.Scanner;

public class WaveyArray {
    static void main(String[] args) {
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
        System.out.print("Wavy Array: ");
        for (int i = 0; i <size ; i+=2) {
            if (i==size-1)break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
