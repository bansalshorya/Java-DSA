package CategoryTwo;

public class HollowBoxwithDiagonalCross {
    public static void main() {
        System.out.println("Hollow Box with Diagonal Cross");
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1||i==n||j==1||j==n||i==j||i+j==n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
