import java.util.*;
class FindAChar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c= s.next().charAt(0);
        
        if(c >='A' && c <= 'Z'){
            System.out.println("The charecter is Uppercase Alphabet");
        }
        else if(c >='a' && c <= 'z'){
            System.out.println("The charecter is Lowercase Alphabet");
        }
        else if(c <='0' && c>='9'){
            System.out.println("The charecter is Digit");
        }
        else{
            System.out.println("The charecter is Special CHaracter !!");

        }
    }
}