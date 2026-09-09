package BASIC_JAVA_CONTENT.array;

import java.util.Scanner;

public class InputArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            a=sc.nextInt();
            arr[i]=a;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
