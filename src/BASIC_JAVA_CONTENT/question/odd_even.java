package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class odd_even {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
