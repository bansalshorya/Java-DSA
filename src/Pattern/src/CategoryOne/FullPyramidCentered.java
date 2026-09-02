package CategoryOne;

public class FullPyramidCentered {
    public static void main() {
        System.out.println("Full Pyramid (Centered)");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j =1 ; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
