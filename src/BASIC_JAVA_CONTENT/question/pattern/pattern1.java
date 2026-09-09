package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern1 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int coln=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coln; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}
