package CategoryFour;

public class CenteredNumberPyramid {
    static void main() {
        System.out.println("Centered Number Pyramid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
