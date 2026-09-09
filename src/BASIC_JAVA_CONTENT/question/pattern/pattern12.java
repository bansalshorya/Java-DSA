package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%2==0) {
                    System.out.print((char) ('A' + j-1)+" ");
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
