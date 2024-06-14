import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class listarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the size of the list:");
        int size = s.nextInt();
        
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            int a = s.nextInt();
            list.add(a);
        }
        
        // Convert ArrayList to TreeSet to remove duplicates and sort
        TreeSet<Integer> tree = new TreeSet<>(list);
        
        // Convert TreeSet back to ArrayList
        ArrayList<Integer> l = new ArrayList<>(tree);
        
        // Print the sorted and duplicate-free ArrayList
        System.out.println("Sorted and duplicate-free list:");
        for (Integer num : l) {
            System.out.println(num);
        }

        s.close();
    }
}
