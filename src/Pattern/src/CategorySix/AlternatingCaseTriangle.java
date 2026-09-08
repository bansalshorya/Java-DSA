package CategorySix;

public class AlternatingCaseTriangle {
    static void main() {
        System.out.println("Alternating Case Triangle");
        int n=4;char Uc='A' , Lc='a';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%2==0){
                    System.out.print(Lc++ +" ");
                    Uc++;
                }
                else{
                    System.out.print(Uc++ +" ");
                    Lc++;
                }
            }
            System.out.println();
        }
    }
}
