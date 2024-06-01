import java.util.Scanner;
public class PrimeNumbeWithLimit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int initial =2;
   
    while (num!=0) {
        int end=2;
        boolean res = false;
        while (end<initial) {
            if(initial%end == 0){
                res = true;
                break;
            }
            end++;
        }
        if(!res){
            System.out.println(initial);
            num--;
        }
        initial++;
    }
    }
}
