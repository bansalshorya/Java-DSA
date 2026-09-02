package CategoryOne;

public class SolidRectangle_SquareGrid {
    public static void main() {
        System.out.println("Solid Rectangle / Square Grid");
        int l=4;
        int b=4;
        for (int i = 1; i <=l ; i++) {
            for (int j = 1; j <=b ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
