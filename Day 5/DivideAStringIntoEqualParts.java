//4.write a java program to divide a string into n equal arts.

import java.util.Scanner;

public class DivideAStringIntoEqualParts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int NumLength = s.nextInt();
        int length = s1.length();
        int d=0;
        for(int i=0;i<length/5;i++){
            String a = s1.substring(d, NumLength);
            NumLength+=5;
            d +=5;
            System.out.println(a);
        }
    }
}
