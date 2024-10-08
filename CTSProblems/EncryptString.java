import java.util.Scanner;


public class EncryptString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        char chstr[] = str.toCharArray();
        int val=0;
        for(int i=str.length();i>=0;i--){
            if(chstr[i]==' '){
                val =0;
            }
            else{
                if(chstr[i]+val > 122){
                    chstr[i]= (char)((chstr[i]+val)-26);
                    val++;
                }
                else{
                    chstr[i]= (char)(chstr[i]+val);
                    val++;
                }
            }
        }


        System.out.println(new String(chstr));
    }
}
