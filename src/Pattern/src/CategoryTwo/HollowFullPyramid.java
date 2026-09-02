package CategoryTwo;

public class HollowFullPyramid {
    static void main() {
        System.out.println("Hollow Full Pyramid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j==1||j==i||i==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
