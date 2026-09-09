package BASIC_JAVA_CONTENT.question;

import java.util.Scanner;

public class prime {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0){
                flag=!flag;
                break;
            }
        }
        if(num<=1){
            System.out.println("UNDEFINED");
        }else if (flag==true) {
            System.out.println("Composite");
        }else {
            System.out.println("Prime");
        }
    }
}
