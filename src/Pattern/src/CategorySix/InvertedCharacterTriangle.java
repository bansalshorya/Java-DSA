package CategorySix;

public class InvertedCharacterTriangle {
    static void main() {
        System.out.println("Inverted Character Triangle");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }
}
