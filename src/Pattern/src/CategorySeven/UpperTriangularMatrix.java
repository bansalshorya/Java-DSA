package CategorySeven;

public class UpperTriangularMatrix {
    static void main() {
        System.out.println("Upper Triangular Matrix");
        int n=4,x=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((j>=i)?x++ +" ":"0 ");
            }
            System.out.println();
        }
    }
}
