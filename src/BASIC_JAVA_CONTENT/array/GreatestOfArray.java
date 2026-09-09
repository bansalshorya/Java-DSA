package BASIC_JAVA_CONTENT.array;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestOfArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
}
