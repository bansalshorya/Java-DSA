package CategorySeven;

public class Anti_DiagonalLineGrid {
    static void main() {
        System.out.println("Anti-Diagonal Line Grid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((i+j==n+1)?"* ":". ");
            }
            System.out.println();
        }
    }
}
