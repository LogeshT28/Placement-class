// package Leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        String  a = s.nextLine();
        String n[] = a.split(" ");
        System.out.println(n[n.length-1].length());
        

    }
}
