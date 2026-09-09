package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class Digit_Num {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num=sc.nextInt(),x=0;
        while (num>0){
        num=num /10;
        x++;
        }
        System.out.println("Entered no. is a "+x+" digit no.");
    }
}

