import java.util.Scanner;

interface Vehicle {
    void move();
}

class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class VehicleOrderSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Order System!");
        System.out.println("Please select the type of vehicle you want to order:");
        System.out.println("1. Helicopter");
        System.out.println("2. Car");
        System.out.println("3. Train");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        Vehicle vehicle;
        
        switch (choice) {
            case 1:
                vehicle = new Helicopter();
                break;
            case 2:
                vehicle = new Car();
                break;
            case 3:
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                scanner.close();
                return;
        }
        
        System.out.println("You have ordered a vehicle. The nature of movement is:");
        vehicle.move();
        
        scanner.close();
    }
}
