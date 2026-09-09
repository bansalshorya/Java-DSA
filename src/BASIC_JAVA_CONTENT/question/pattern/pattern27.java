package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern27 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side= sc.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side ; j++) {
                if (i<=j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
//        for (int i = 0; i <=side ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <=side-i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
