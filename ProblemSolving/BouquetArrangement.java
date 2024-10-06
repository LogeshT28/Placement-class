
public class BouquetArrangement {

    public static int[] arrangeBouquet(int num, int k, int[] sticks) {
        // First part: Sort the first K elements in increasing order (Selection Sort)
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (sticks[i] > sticks[j]) {
                    // Swap sticks[i] and sticks[j]
                    int temp = sticks[i];
                    sticks[i] = sticks[j];
                    sticks[j] = temp;
                }
            }
        }

        // Second part: Sort the remaining elements in decreasing order (Selection Sort)
        for (int i = k; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (sticks[i] < sticks[j]) {
                    // Swap sticks[i] and sticks[j]
                    int temp = sticks[i];
                    sticks[i] = sticks[j];
                    sticks[j] = temp;
                }
            }
        }

        return sticks;
    }

    public static void main(String[] args) {
        // Sample Input
        int num = 10;
        int k = 3;
        int[] sticks = {55, 5467, 9, 1, 8734, 4674, 5, 4, 56, 34};

        // Get the result
        int[] result = arrangeBouquet(num, k, sticks);

        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }
        // Expected Output: 1 5 9 55 4674 5467 8734 56 34 4
    }
}



