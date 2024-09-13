import java.util.Scanner;

class RemoveSpace{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=' '){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}