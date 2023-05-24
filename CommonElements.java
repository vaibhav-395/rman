import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        int[] result = findCommonElements(array1, array2);
        
        System.out.println("Common elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        
        Set<Integer> commonElementsSet = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElementsSet.add(num);
            }
        }
        
        int[] result = new int[commonElementsSet.size()];
        int i = 0;
        for (int num : commonElementsSet) {
            result[i++] = num;
        }
        
        return result;
    }
}
