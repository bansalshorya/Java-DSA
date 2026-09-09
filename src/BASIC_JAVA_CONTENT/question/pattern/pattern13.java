package BASIC_JAVA_CONTENT.question.pattern;
import java.util.Scanner;
public class pattern13 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int side= sc.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side+1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// i+jmax=n+1   =>  jmax=n+1-i
