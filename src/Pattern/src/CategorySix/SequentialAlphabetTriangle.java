package CategorySix;

public class SequentialAlphabetTriangle {
    static void main() {
        System.out.println("Sequential Alphabet Triangle");
        int n=4;char x='A';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(x+++" ");
            }
            System.out.println();
        }
    }
}
