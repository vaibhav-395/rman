import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 1};
        int[] result = removeRepeatedElements(array);
        
        System.out.println("Array with repeated elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nArray without repeated elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] removeRepeatedElements(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int num : array) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                resultList.add(num);
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
