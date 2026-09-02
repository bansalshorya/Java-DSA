package CategoryOne;

public class InvertedFullPyramid {
    public static void main() {
        System.out.println("Inverted Full Pyramid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = n+1-i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
