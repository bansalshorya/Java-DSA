package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern6 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int side =sc.nextInt();
        for (char i = 'A'; i <((int)'A'+side) ; i++) {
            for (char j = 'A'; j <((int)'A'+side) ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
