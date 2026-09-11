package CategorySeven;

public class Cross_RegionDivisionMatrix {
    static void main() {
        System.out.println("Cross-Region Division Matrix");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1 && (j==1 || j==n)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
