abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class PercentageCalculation {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        B studentB = new B(85, 90, 70, 95);

        double percentageA = studentA.getPercentage();
        double percentageB = studentB.getPercentage();

        System.out.println("Percentage of Student A: " + percentageA + "%");
        System.out.println("Percentage of Student B: " + percentageB + "%");
    }
}
