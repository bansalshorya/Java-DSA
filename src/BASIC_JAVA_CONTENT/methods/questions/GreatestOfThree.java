package BASIC_JAVA_CONTENT.methods.questions;

import java.util.Scanner;

public class GreatestOfThree {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
