class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        try {
            long result1 = myCalculator.power(2, 4);
            System.out.println("2 raised to the power 4 is: " + result1);

            long result2 = myCalculator.power(-1, 5); // Will throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
