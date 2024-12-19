public class startproblems {
    public static void increasestar(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void decreasestar(int n){
        for(int i =n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void squarestar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        increasestar(n);
        System.out.println("--------------------");
        decreasestar(n);
        System.out.println("--------------------");
        squarestar(n);
    }
}
