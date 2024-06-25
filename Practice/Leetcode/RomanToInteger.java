package Practice.Leetcode;

import java.util.Scanner;

public class RomanToInteger {
    public static int Int(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int prev=0;
        int total=0;
        for(int i=n.length()-1;i>=0;i--){
            char c = n.charAt(i);
            int curr = Int(c);
            if(curr < prev){
                total-=curr;
            }
            else{
                total+=curr;
            }
            curr=prev;
        }
        System.out.println(total);
    }
}
