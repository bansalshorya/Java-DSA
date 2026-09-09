package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern21 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side= sc.nextInt();

        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2==0){
                    System.out.print(1+ " ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
