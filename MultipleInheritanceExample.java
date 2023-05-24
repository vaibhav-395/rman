interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface Person1 {
    void store();
    void disp();
}

class Customer implements Account, Person1 {
    private String name;
    private int accountNumber;
    private double balance;

    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + (balance * 0.05)); // Assuming 5% interest rate
    }

    public void store() {
        System.out.println("Storing person information...");
    }

    public void disp() {
        System.out.println("Displaying person information...");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.set("John Smith", 12345, 10000.0);
        customer.display();
        customer.store();
        customer.disp();
    }
}
