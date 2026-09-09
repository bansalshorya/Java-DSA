package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class magnitude_Num {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (-num>69){
            System.out.println("Magnitude of "+num+" is greater than 69");
        }
        else System.out.println("False");
    }
}
