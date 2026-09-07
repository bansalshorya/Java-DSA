package CategoryFour;

public class FloydTriangle {
    static void main() {
        System.out.println("Floyd's Triangle");
        int n=4,x=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}
