import java.util.Scanner;

class Assignment3 {

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
