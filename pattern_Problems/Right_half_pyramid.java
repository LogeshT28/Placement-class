import java.util.Scanner;
class Right_half_pyramid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");  
            }
            System.out.println();
        }
    }
}
