package BASIC_JAVA_CONTENT.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i]=arr[j]+arr[i];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;j--;
        }
        for (int k = 0; k <5 ; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        }
}
