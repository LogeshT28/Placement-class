package Practice.Examly;
import java.util.Scanner;

public class MagicMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Magic square is only possible for odd numbers.");
            return;
        }

        int[][] mat = new int[n][n];
        int num = 1;
        int i = 0, j = n / 2;

        while (num <= n * n) {
            mat[i][j] = num;
            num++;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;
            
            if (mat[newi][newj] != 0) {
                newi = (i + 1) % n;
                newj = j;
            }

            i = newi;
            j = newj;
        }

        // Print the magic square
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}