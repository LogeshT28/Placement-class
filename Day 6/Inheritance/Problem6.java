//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
// Create a subclass called Employee that adds a new method named getEmployeeId()
// and overrides the getLastName() method to include the emplovee's job title.
import java.util.Scanner;
class Person{
    String Fname="";
    String Lname="";
    int id = 0;
    public String getFirstName(String Fname){
        return Fname;
    }
    public String getLastName(String Lname){
        return Lname;
    }
    int getEmployeeId(int id){
        return id;
    }
}
class Employee extends Person{
    public String getFirstName(String Fname){
        return Fname;
    }
    public String getLastName(String Lname,String JobTitile){
        return Lname+JobTitile;
    }
    int getEmployeeId(int id){
        return id;
    }
}
public class Problem6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Fname = s.nextLine();
        String Lname=s.nextLine();
        String JobTitile = s.nextLine();
        int id = s.nextInt();
        Employee o = new Employee();
        System.out.println("First Name :"+o.getFirstName(Fname));
        System.out.println("Last Name :"+o. getLastName(Lname));
        System.out.println("Full Name:"+o.getLastName(Lname, JobTitile));
        System.out.println("Employee Id :"+o.getEmployeeId(id));
    }
}
