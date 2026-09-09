package BASIC_JAVA_CONTENT.question;
import java.util.Scanner;
public class rectangle {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();
        int width= sc.nextInt();
        int area= length*width;
        int perimeter=2*(length+width);
        System.out.println("Area of rectangle: "+area);
        System.out.println("Perimeter of rectangle: "+perimeter);
    }
}
