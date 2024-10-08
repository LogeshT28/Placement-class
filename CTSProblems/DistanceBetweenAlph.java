import java.util.Scanner;

public class DistanceBetweenAlph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c1=sc.next().charAt(0);
        //char c1 = 'c';
        char c2=sc.next().charAt(0);
        int m1=(int)c1;
        int m2=(int)c2;
        int res=m2-m1;
        if(res+m2<=122)
        {
        System.out.print((char)(res+m2));
        }
        else 
        {
            System.out.println((char)(res+m2-26));
        }

        //System.out.println((int)(c1-'a'));
    }

}
