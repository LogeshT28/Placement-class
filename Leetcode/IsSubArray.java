package Leetcode;

import java.util.Scanner;

public class IsSubArray {

        public static boolean isSubseq(String s, String t) {
            //int count=0;
            int k=0;
            if(s.length() ==0){
                return true;
            }
            for(int i=0;i<t.length();i++){
                //char c = s.charAt(i);
                if(s.charAt(k)==t.charAt(i)){
                    System.out.println(k+" "+t.charAt(i)+" "+i);
                    k++;
                }
                if(k==s.length()){
                return true;
            }
            }
            return false;
            
        }
    public static boolean isSubsequence(String s, String t) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //System.out.println(c);
            for(int j=0;j<t.length();j++){
                //System.out.println(t.charAt(j));
                if(c==t.charAt(j)){
                    count++;
                }
            }
        }
        return s.length()==count;
    }
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if(isSubsequence(a,b)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        if(isSubseq(a,b)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }

    }
}

