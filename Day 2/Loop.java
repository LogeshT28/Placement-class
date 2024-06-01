import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int range = s.nextInt();
        // int i=0;
        // while (i<=range) {
        //     System.out.print(i+" ");
        //     i++;
        // }

    // Use While Loop to Print Odd Number; 
        // int a = s.nextInt();
        // int b = s.nextInt();
        // while (a<=b) {
        //     if(a%2 !=0){
        //         System.out.print(a+" ");
        //     }
        //     a++;
        // }

 // Alter Way ;
        // int a = s.nextInt();
        // int b = s.nextInt();
        // while (a<=b) {
        //         if(a%2 !=0){
        //             System.out.print(a+" ");
        //             a+=2;
        //         }else{
        //             a++;
        //         }
        //     }

    
// 
        int a = s.nextInt();
        int b = s.nextInt();
        int c= s.nextInt();
        int count = 0;
        while ((a<=b) && (count < c))
        {
            if(a%2==0){
                System.out.print(a+" ");
                a+=2;
                count++;
            }
            else{
                a++;
            }
            
        }


//Alter Way
        while ((a<=b) && ( c!=0))
        {
            if(a%2==0){
                System.out.print(a+" ");
                a+=2;
                c--;
            }
            else{
                a++;
            }
            
        } 

    }
}
