import java.util.Scanner;

class Triangle extends Shape{
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

