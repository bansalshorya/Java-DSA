package CategoryOne;

public class Plus_CrossSignPattern {
    public static void main() {
        System.out.println("Plus / Cross Sign Pattern");
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==(n/2)+1 || j==(n/2)){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
