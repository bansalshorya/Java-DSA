package CategoryOne;

public class SolidRhombus {
    public static void main() {
        System.out.println("Solid Rhombus");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
