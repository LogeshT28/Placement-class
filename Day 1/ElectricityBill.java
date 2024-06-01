import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner  s=  new Scanner(System.in);
        int bill = s.nextInt();
        if(bill > 201){
            if(bill >= 200 && bill <= 300){
                bill -= 200;
                double res = bill*1.20;
                System.out.println("Bill is "+res);
            }
            else if(bill >= 301 && bill <= 400){
                bill -= 200;
                double res = bill*1.50;
                System.out.println("Bill is "+res);
            }
            else if(bill >= 401 && bill <= 500){
                bill -= 200;
                double res = bill*2;
                System.out.println("Bill is "+res);
            }
        }
        else{
            System.out.println("Bill is 0");
        }
    }
}
