package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class quadrant_Locate {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if (x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if (x>0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if (x<0 && y<0){
            System.out.println("4th Quadrant");
        }
        else if (y==0){
            System.out.println("X-axis");
        }
        else if (x==0){
            System.out.println("Y-axis");
        }
        else if (x==0 && y==0) {
            System.out.println("Origin");
        }
    }
}
