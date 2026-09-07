package CategoryFour;

public class ConstantRowNumberTriangle {
    public static void main() {
        System.out.println("Constant Row Number Triangle");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print( i+" ");
            }
            System.out.println();
        }
    }
}
