
import java.util.*;
public class CircleProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pow=1;
        while(pow <=n){
            pow = pow*2;
            
        }
        pow = pow/2;
        int res = ((n-pow)*2)+1;
        System.out.println(res);
    }

}
