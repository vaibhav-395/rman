import java.util.Scanner;

class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    float getInputs(){
        System.out.print("Please enter radius: ");
        float r = sc.nextFloat();
        return r;
    }
}

