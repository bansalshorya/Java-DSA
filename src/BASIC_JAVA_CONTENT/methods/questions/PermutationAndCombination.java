package BASIC_JAVA_CONTENT.methods.questions;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int Factorial(int num){
        int result=1;
            for (int j = 2; j <=num ; j++) {
                result *=j;
        }
        return result;
    }
    public static int Permutation(int n,int r){
        if (r > n || n < 0 || r < 0) return 0;
        return Factorial(n)/Factorial(n-r);
    }

    public static int Combination(int n,int r){
        if (r > n || n < 0 || r < 0) return 0;
        return Factorial(n)/(Factorial(n-r)*Factorial(r));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r =sc.nextInt();
        if(n >= r && n >= 0 && r >= 0){
            System.out.println("Permutation: "+ Permutation(n,r));
            System.out.println("Combination: "+ Combination(n,r));
        }
        else System.out.println("Typing Error");
        sc.close();
    }
}
