//The Numbers between 100 and 200 both includ=svie having only 1,4 and 9 as their digits are 111,114,119,141,144,149,191,199
//The count is 9 henace 9 is returned.


import java.util.Scanner;

public class NumBetween149 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i <= 200; i++) {
            String Str = Integer.toString(i);

            if (Str.matches("[194]+")) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Count: " + count);
        

        



    }
}
