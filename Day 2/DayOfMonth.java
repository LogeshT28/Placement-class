import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The Given Input Month have 31 Days in a Month ");   
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The Given Input Month have 30 Days in a Month ");   
                break;
            case 2:
                System.out.println("The Given Input Month have 28 Days in a Month ");   
                break;
            default:
                break;
        }
    }
}
