import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Insert elements into the ArrayList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Iterator Loop:");
        // Iterate using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
        }
        
        System.out.println("Advanced For Loop:");
        // Iterate using Advanced For Loop
        for (int num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("For Loop:");
        // Iterate using for-loop
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.println(num);
        }
    }
}
