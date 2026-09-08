package CategorySix;

public class FullAlphabetDiamond {
    static void main() {
        System.out.println("Full Alphabet Diamond");
        int n=3;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64)+" " );
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j =1 ; j <n-i+1 ; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
