package CategorySix;

public class WordSubstringPyramid {
    static void main() {
        System.out.println("Word Substring Pyramid");
        int n=4;char[] jav={'J','A','V','A'};
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(jav[j]+ " ");
            }
            System.out.println();
        }
    }
}
