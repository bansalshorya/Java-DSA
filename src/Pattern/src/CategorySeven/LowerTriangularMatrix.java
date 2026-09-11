package CategorySeven;

public class LowerTriangularMatrix {
    static void main() {
        System.out.println("Lower Triangular Matrix");
        int n=4,x=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((i>=j)?x++ + " ":"0 ");
            }
            System.out.println();
        }
    }
}
