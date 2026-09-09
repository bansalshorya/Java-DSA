package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side;
//      side=sc.nextInt();
        side=5;
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side ; j++) {
                if(i==(side/2)+1 ||j==(side/2)+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
