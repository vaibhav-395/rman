import java.util.Scanner;

class ShapeInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        float r1 = c.getInputs();
        c.setArea(r1);

        Square s = new Square();
        double s1 = s.getInputs();
        s.setArea(s1);

        Triangle t = new Triangle();
        double[] hb1 = t.getInputs();
        t.setArea(hb1);

    }

}

class Circle extends Shape1{
    Scanner sc = new Scanner(System.in);
    float getInputs(){
        System.out.print("Please enter radius: ");
        float r = sc.nextFloat();
        return r;
    }
}


 class Shape1 {

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



class Square extends Shape1{
    Scanner sc = new Scanner(System.in);
    double getInputs(){
        System.out.print("Please enter length of side: ");
        double s = sc.nextDouble();
        return s;
    }
}



class Triangle extends Shape1{
    Scanner sc = new Scanner(System.in);
    double[] getInputs(){
        System.out.print("Please enter length of height: ");
        double h = sc.nextDouble();
        System.out.print("Please enter length of base: ");
        double b = sc.nextDouble();

        double[] arr = {h,b};
        return arr;

    }
}

