import java.util.Scanner;

public class Shape {

    void setArea(float r){
        System.out.println("The area of the circle is: " + (3.14*r*r));
    }

    void setArea(double s){
        System.out.println("The area of the square is: " + (s*s));
    }

    void setArea(double[] hb){
        double h = hb[0];
        double b = hb[1];
        System.out.println("The are of the triangle is: " + (0.5*b*h));
    }

}
