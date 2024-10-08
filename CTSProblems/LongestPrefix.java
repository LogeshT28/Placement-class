import java.util.ArrayList;
import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //char ch[] =str.toCharArray();
        // int start=0;
        // int end=ch.length-1;
        
        // while(start > end){
        //     if(ch[start]==ch[end]){
        //         count++;
        //         start++;
        //         end--;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // ArrayList<Character> list = new ArrayList<>();
        // for(int i=0;i<str.length();i++){
        //     char c = str.charAt(i);
        //     if(!list.contains(c)){
        //         list.add(c);
        //     }
        //     else{
        //         count++;
        //     }
        // }
        int count = 0;
int l = str.length();
boolean flag;

for (int i = 1; i <= l / 2; i++) {
    flag = true;  // Reset flag for each i

    // Compare prefix and suffix of length i
    for (int j = 0; j < i; j++) {
        if (str.charAt(j) != str.charAt(l - i + j)) {
            flag = false;
            break;  // No need to check further if there is a mismatch
        }
    }

    // If flag is still true, we found a matching prefix of length i
    if (flag) {
        count = i;
    }
}

        System.out.println(count);
    }
}
