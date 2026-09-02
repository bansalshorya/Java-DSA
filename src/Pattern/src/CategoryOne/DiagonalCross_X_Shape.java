package CategoryOne;

public class DiagonalCross_X_Shape {
    static void main() {
        System.out.println("DiagonalCross_X_Shape");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(  j==i || i+j==n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
