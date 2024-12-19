package Practice.string;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int k = s.nextInt();

        String part1 = a.substring(k);
        String part2 = a.substring(0, k);
        
        // System.out.println(part1);
        // System.out.println(part2);
        System.out.println(part1+part2);
    }
}
