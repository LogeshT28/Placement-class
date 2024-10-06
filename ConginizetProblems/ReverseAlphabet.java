import java.util.Scanner;

public class ReverseAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str =  str.toLowerCase();
        int start=0;
        int end=str.length()-1;
        char[] arr = str.toCharArray();
        while(start<=end)
        {

            if(Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(!Character.isAlphabetic(arr[start]) ){
                
                start++;
            }
            else if(!Character.isAlphabetic(arr[end])){
                end--;
            }
            else{
                start++;
                end--;
            }`
            
        }


        System.out.println(new String(arr));
    }
}
