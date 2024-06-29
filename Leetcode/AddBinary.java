package Leetcode;

import java.util.Scanner;

public class AddBinary {
    //Method 1 
    public static String SumOfBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
    //Method 2
    public static String addBinary(String a, String b) {
        String res ="";
        int c = 0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i >=0 || j >=0){
            int n1 = 0;
            int n2=0;

            if(i >=0){
                n1 = (int)(a.charAt(i)- '0');
            }
            if(j >=0){
                n2 = (int)(b.charAt(j)- '0');
            }
            // System.out.println(n1);
            // System.out.println(n2);
                
            if(n1==1 && n2==1 && c==1){
                c=1;
                res="1"+res;
            }
            else if(n1==1 && n2==1 && c==0){
                c=1;
                res="0"+res;
            }
            else if((n1==1 || n2==1) && c==1){
                c=1;
                res="0"+res;
            }
        //    else  if((n1==1 || n2==1 )&& c==0){
        //         c=0;
        //         res="1"+res;
        //     }


        
            else{
                res=(n1+n2+c)+res;
                c=0;
            }
            i--;
            j--;
        }
        if(c !=0){
            return c+""+res;
    }
    return res;
    }
   public static void main(String[] args) {
    Scanner s =new Scanner (System.in);
    String a = s.nextLine();
    String b=s.nextLine();

    System.out.println(addBinary(a,b));
    System.out.println(SumOfBinary(a,b));
   }

}
