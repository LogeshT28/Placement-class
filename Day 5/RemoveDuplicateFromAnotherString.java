//5.Write a java program to remove duplicate characters from a given string that appear in another given string.given string
import java.util.Scanner;

public class RemoveDuplicateFromAnotherString {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String n1 = s.nextLine();
            String n2 = s.nextLine();
            String res="";
            for(int i=0;i<n1.length();i++){
                int t=0;
                for(int j=0;j<n2.length();j++){
                    if(n2.charAt(j) == n1.charAt(i)){
                        t=1;
                    }
                }
                if(t==0){
                    res+=n1.charAt(i);
                }
            }
            System.out.print(res);
        }
    }
