public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        int i = 1;
        while (i <= n) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            
            i++;
        }
    }
}
