package BASIC_JAVA_CONTENT.question.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int side=sc.nextInt();
//        int coln=sc.nextInt();
        for (char i = 'a'; i < ((int)'a'+side); i++) {
            for (char j = 'a'; j < ((int)'a'+side); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
