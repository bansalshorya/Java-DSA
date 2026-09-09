package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern32 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        for (int i = 1; i <=2*side-1 ; i++) {
            for (int j = 1; j <=2*side-1 ; j++) {
                int a=i; int b=j;
                if(i>side) a=2*side-i;
                if(j>side) b=2*side-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
