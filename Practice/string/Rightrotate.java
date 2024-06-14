package Practice.string;

import java.util.Scanner;

public class Rightrotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int k = s.nextInt();

         k= k%a.length();
        String part1 = a.substring(a.length()-k);
        String part2 = a.substring(0, a.length()-k);
        
        System.out.println(part1+part2);
    }
}
