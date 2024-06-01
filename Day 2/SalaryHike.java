import java.util.*;
class SalaryHike{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int salary = s.nextInt();
        int performance = s.nextInt();
        
        if (performance > 80) {
            double hike = (salary / 100.0) * 30;
            double annual_salary = salary + hike;
            System.out.println("This Year Hike is: " + hike);
            System.out.println("This Year LPA is: " + annual_salary);
        } else {
            double hike = (salary / 100.0) * (30 - (80 - performance) * 0.30);
            double annual_salary = salary + hike;
            System.out.println("This Year Hike is: " + hike);
            System.out.println("This Year LPA is: " + annual_salary);
        }
    }
}
