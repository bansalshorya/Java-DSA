package CategoryFour;

public class ReverseConsecutiveNumberPyramid {
    static void main() {
        System.out.println("Reverse Consecutive Number Pyramid");
        int n=4,x=10;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >=1 ; j--) {
                System.out.print(x-- +" ");
            }
            System.out.println();
        }
    }
}
