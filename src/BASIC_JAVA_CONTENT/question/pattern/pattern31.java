package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern31 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 1; i <=2*side-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for (int i = 1; i <=side-1 ; i++) {
            for (int j = 1; j <=side-i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=side-i ; j++) {
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
