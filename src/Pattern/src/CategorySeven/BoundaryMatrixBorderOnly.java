package CategorySeven;

public class BoundaryMatrixBorderOnly {
    static void main() {
        System.out.println("Boundary Matrix (Border Only)");
        int n=4;int x=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((i==1||i==n||j==1||j==n)?x++ +" ":". ");
            }
            System.out.println();
        }
    }
}
