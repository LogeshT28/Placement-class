import java.util.*;
public class Bank {
    static int balance = 200000;
    public static void Deposit(int amount){
        int res = balance + amount;
        System.out.println("Amount Succesfully Deposited !!");
        System.out.println("Your Account Balance : "+res);
    }
    public static void Withdraw(int amount){
        int res = balance - amount;
        System.out.println("Amount Succesfully Withdrawed !!");
        System.out.println("Your Account Balance : "+res);
    }
    public static void main(String[] args) {
        Scanner  s=  new Scanner(System.in);
        int option = 0;
        while(option != 3){
            System.out.println("-----------------------------");
            System.out.println("Menu ");
            System.out.println("Press 1 to Deposit Amount :");
            System.out.println("Press 2 to Withdraw Amount :");
            System.out.println("Press 3 Quit the process");
            System.out.println("-----------------------------");
            System.out.println("Enter Your Option :");
            option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Your Amount to Deposit :");
                    int amount = s.nextInt();
                    Deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter Your Amount to Withdraw :");
                    int withdraw = s.nextInt();
                    Withdraw(withdraw);
                    break;
                default:
                    break;
            }
        }
    }
}
