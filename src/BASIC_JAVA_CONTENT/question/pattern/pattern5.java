package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side =sc.nextInt();
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
