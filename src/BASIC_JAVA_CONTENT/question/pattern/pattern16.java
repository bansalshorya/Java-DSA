package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side+1-i ; j++) {
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
}
