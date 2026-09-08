package CategorySix;

public class AlphabetRightPyramid {
    static void main() {
        System.out.println("Alphabet Right Pyramid");
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
