import java.util.Scanner;

public class HillsanVallys {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int high=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='u'){
                high++;
                if(high ==0){
                    count++;
                }
            }
            else{
                high--;
            }
        }
        System.out.println(count);

    }
}
