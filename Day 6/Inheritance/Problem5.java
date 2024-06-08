//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

import java.util.Scanner;

class BankAccount{
    public int balance =10000;
    public int deposit(int amount){
        return balance+amount;
    }
    public int withdraw(int amount){
        return balance-amount;    
    }
}
class SavingsAccount extends BankAccount{
    public int deposit(int amount){
        return balance+amount;
    }
    public int withdraw(int amount){
        if(balance <100){
            System.out.println("the Balance Was Insufficient");
        }
        else{
            System.out.println("The Amount was succesfully Withdrwed ");
        }
        return balance-amount;
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        SavingsAccount obj = new SavingsAccount();
        System.out.println(obj.deposit(amount));
        System.out.println(obj.withdraw(amount));
    }
}
