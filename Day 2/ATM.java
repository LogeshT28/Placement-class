import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        
        if(amount >=500){
            int modules = amount/500;
            amount= (amount) - (modules*500);
            System.out.println(modules+" 500 Notes Will Get It");
        }
        if(amount >=200){
            int modules = amount/200;
            amount= (amount) - (modules*200);
            System.out.println(modules+" 200 Notes Will Get It");
        }
        if(amount >=100){
            int modules = amount/100;
            amount= (amount) - (modules*100);
            System.out.println(modules+" 100 Notes Will Get It");
        }

    }
}
