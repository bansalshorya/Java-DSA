package BASIC_JAVA_CONTENT.methods.questions;
import java.util.Scanner;
public class AreaOfAll2DShape {
    public static int AreaOfRectangle(int length,int width) {
        return length*width;
    }
    public static int AreaOfSquare(int side){
        return side*side;
    }
    public static double AreaOfCircle(double radius){
        return Math.PI*radius*radius;
    }
    public static double AreaOfTriangle(double height,double base){
        return 0.5*height*base;
    }
}
