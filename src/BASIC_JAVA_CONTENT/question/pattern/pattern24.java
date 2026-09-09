package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern24 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int side= sc.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
