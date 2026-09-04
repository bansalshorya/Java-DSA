import java.util.*;
public class pattern1 {
    static void print(int n, int max, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        for (int i = Math.min(n, max); i >= 1; i--) {
            print(n - i, i, str + i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        print(n, n, "");
    }
}