package Practice.TalentalyProblem;

import java.util.Scanner;

public class CountFingure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = n%8;
        String v = "";
        switch (res) {
            case 1:
                v="Little";
                break;
            case 2:
                v="Ring";
                break;
            case 3:
                v="Middle";
                break;
            case 4:
                v="Index";
                break;
            case 5:
                v="Thumb";
                break;
            default:
                break;
        }
        System.out.println(v);
    }
}
