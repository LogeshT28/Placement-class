// Java programme to print the result of removing duplicates from a given string

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        for(int i=0;i<=s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    s1 = s1.substring(0, j)+s1.substring(j+1, s1.length());
                    j--;
                }
            }
        }
        System.out.println(s1);  
    } 
}
