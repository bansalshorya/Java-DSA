package CategoryFour;

public class IncrementalColumnNumberTriangle {
    static void main() {
        System.out.println("Incremental Column Number Triangle");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
