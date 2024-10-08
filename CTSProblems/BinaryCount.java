import java.util.*;
class BinaryCount{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        
        for(int i=1;i<=n;i++){
            int num = i;
            int sum=0;
            while(num !=0){
                if(num %2==0){
                    sum +=1;
                }
                else{
                    sum +=2;
                }
                num /=2;
            }
            if(sum %2 !=0){
                count++;
            }
        }

        System.out.println(count);
    }
}