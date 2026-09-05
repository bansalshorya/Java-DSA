package CategoryTwo;
import java.util.Scanner;

public class ConcentricHollowSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square (odd number, e.g., 7): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Compute minimum distance to the outer perimeter
                int d = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));

                // If the distance is even, print an asterisk; otherwise, print a space
                if (d % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
