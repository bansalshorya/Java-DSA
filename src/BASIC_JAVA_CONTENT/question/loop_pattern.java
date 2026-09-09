package BASIC_JAVA_CONTENT.question;

import java.util.Scanner;

public class loop_pattern {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
            System.out.println(n);
            n=n-1;
        }
    }
}
