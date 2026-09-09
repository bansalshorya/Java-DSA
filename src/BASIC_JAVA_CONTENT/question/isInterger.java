package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class isInterger {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int check = (int)num;
        if (num == check){
            System.out.println("The no. is integer");
        }
        else{
            System.out.println("The no. is not an integer");
        }
    }
}
