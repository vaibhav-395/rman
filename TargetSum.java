import java.io.*;
import java.util.*;

public class TargetSum{
    public static void main(String[] args) throws IOException{
        // Creating Buffer for reading input from user...
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // Getting input from user for the length of the array!...
        System.out.println("Provide length of the input array: ");
        int n = Integer.parseInt(buffer.readLine());

        int[] iparray = new int[n];

        for(int i=0; i < n; i++){
            System.out.println("Please provide the next Integer for insertion in array");
            iparray[i] = Integer.parseInt(buffer.readLine());
        }

        System.out.println("Enter the Target for TWO SUM");
        int target = Integer.parseInt(buffer.readLine());

        ArrayList<String> req = findTargets(iparray,target);
        System.out.println("Required Two_Sum Pairs:" + req);
    }

    public static ArrayList<String> findTargets(int[] iparray,int target){
        ArrayList<String> outarray = new ArrayList<>();
        HashMap<Integer,Integer> repo = new HashMap<>();

        // Here key:value is index:int in array...
        for (int i=0; i<iparray.length; i++){
            repo.put(iparray[i],i);
        }

        for (int u=0; u<iparray.length; u++){
            int diff = target - iparray[u];
            if(repo.containsKey(diff)){
                outarray.add("("+ Integer.toString(iparray[u]) + "," + Integer.toString(diff) +")");
            }
        }
        return outarray;
    }
}
