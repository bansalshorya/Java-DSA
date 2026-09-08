package CategorySix;

public class ASCIIValueGrid {
    static void main() {
        System.out.println("ASCII Value Grid");
        int n=3;char x='A';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((int)(x++) +" ");
            }
            System.out.println();
        }
    }
}
