package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int coln= sc.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=coln ; j++) {
                if (i==row || i==1 || j==coln || j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
