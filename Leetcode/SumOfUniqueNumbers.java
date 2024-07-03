
import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueNumbers {

    public static int sumOfUniqueNumbers(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();  // Using a HashSet to store unique numbers
        int sum = 0;

        for (int num : arr) {
            if (uniqueNumbers.add(num)) {  // If the number is added to the set, it's unique
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int result = sumOfUniqueNumbers(array);
        System.out.println("The sum of unique numbers is: " + result);
    }
}