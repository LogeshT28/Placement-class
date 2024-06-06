//Write a Java programme to find the first non repeat character in a string.

import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();

        for(int i=1;i<=s1.length();i++){
            int temp =0;
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    temp=1;
                    break;
                }
                
            }
            if(temp==0){
                System.out.println(s1.charAt(i));
                break;
            }
        }
    }
}
