import java.util.*;
class ExtractNumberFromString{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp=0;
        String str  = s.nextLine();
        boolean flag = false;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                temp = temp*10+(str.charAt(i)-'0');
                flag = true;
            }
            else{
                if(flag){
                    System.out.println(temp);
                    temp=0;
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println(temp);}


    }
}