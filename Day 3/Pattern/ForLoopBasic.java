import java.util.Scanner;
public class ForLoopBasic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<a;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

         for(int i=0;i<a;i++){
            System.out.print("*");
            for(int j=0;j<a-2;j++){
                if(i==0 || i==a-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
         }
         System.out.println("----------------------------");

         for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(( i==0 || i==a-1) ||( j==0 || j==a-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}
