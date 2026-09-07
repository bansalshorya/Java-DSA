package CategoryFour;

public class Right_AlignedNumberTriangle {
    static void main() {
        System.out.println("Right-Aligned Number Triangle");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
