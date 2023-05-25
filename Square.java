import java.util.Scanner;

class Square extends Shape{
    Scanner sc = new Scanner(System.in);
    double getInputs(){
        System.out.print("Please enter length of side: ");
        double s = sc.nextDouble();
        return s;
    }
}
