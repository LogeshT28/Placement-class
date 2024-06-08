//4)) Write a Java programme to create a class called employee with method called work and get salary 
//create a subclass called HR manager and that overrides the work method and adds a new method called add employee

import java.util.Scanner;

class Employee{
        public void Work(){
            System.out.println("Employee has work ");
        }
        public int getSalary(int a){
            return a;
        }
}
class HRmanager extends Employee{
        public void Work(){
            System.out.println("Employee has No work ");
        }
        public int getSalary(int a,int month){
            return a*month;
        }
        public void addEmployee(){
            System.out.println("A New Emlpyee Added in Company");
        }
}
class Problem4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        HRmanager o = new HRmanager();
        o.Work();
        System.out.println("Per Month Salary is : "+o.getSalary(a));
        o.addEmployee();
        System.out.println("Per Year Salary is : "+o.getSalary(a, b));
        
    }
}
