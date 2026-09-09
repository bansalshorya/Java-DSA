package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern29 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int nsp=side-1;
        int nst=1;
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;nst+=2;
        }
        nsp=1;nst=2*side-3;
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp++;nst-=2;
        }
    }
}
