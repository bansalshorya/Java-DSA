package BASIC_JAVA_CONTENT;

import java.util.Scanner;

public class input {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Values: \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Sum: ");
        System.out.println(a+b+c);
    }
}
