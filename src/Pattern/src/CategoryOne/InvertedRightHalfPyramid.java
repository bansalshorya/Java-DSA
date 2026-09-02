package CategoryOne;

public class InvertedRightHalfPyramid {
    public static void main() {
        System.out.println("InvertedRightHalfPyramid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
