package BASIC_JAVA_CONTENT;


import java.util.Scanner;

public class hello {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int a=sc.nextInt();
        int sq=a*a;
        System.out.print("Square is: ");
        System.out.println(sq);
    }
}
