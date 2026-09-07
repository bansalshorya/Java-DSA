package CategoryFour;

public class InvertedCenteredNumberPyramid {
    static void main() {
        System.out.println("Inverted Centered Number Pyramid");
        int n=4;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
