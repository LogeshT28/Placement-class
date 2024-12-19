import java.util.Scanner;

public class Number_changing_pyramid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int temp =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(temp+" ");  
                temp +=1;
            }
            System.out.println();
        }
    }
}
