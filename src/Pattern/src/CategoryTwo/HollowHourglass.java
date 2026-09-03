package CategoryTwo;

public class HollowHourglass {
    static void main() {
        System.out.println("Hollow Hourglass");
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=1 ; j--) {
                if(i==j||i==1||j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if (i==j||i==n||j==1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
