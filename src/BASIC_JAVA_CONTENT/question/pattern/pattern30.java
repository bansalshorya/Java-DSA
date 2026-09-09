package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern30 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 1; i <=2*side-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side-i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=side-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
