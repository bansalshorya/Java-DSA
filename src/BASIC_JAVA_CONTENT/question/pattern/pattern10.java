package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 0; i <side; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
