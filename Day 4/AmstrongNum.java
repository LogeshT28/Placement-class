import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp=0;
        int count=0;
        temp=n;//123
        while (temp!=0) {
            count++;//1+1+1
            temp/=10;
        }
        temp=n;
        int res=0;
        while (temp!=0) {
            res+=Math.pow((temp%10), count);
            temp/=10;
        }
        System.out.println(res);
        if(n==res){
            System.out.println(n+"It is Amstrong Number"); 
        }
        else{
            System.out.println(n+"It is Not Amstrong Number"); 
           
        }
    }
}
