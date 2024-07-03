import java.util.Scanner;

class DecimalToBinary{
    public static void  DecimalBinary() {
            int decimal = 10;
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary representation of " + decimal + " is " + binary);
        int count=0;
        for(int i=0;i<binary.length();i++){
            char c = binary.charAt(i);
            if(c == '1'){
                count++;
            }
        }
        System.out.println(count);
        }   
        public static int hammingWeight(int n) 
    {
        int c=0;
        while(n>0)
        {
            if(n%2==1)
              c++;
            n/=2;  
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // String binary = Integer.toBinaryString(n);
        // int count=0;
        // for(int i=0;i<binary.length();i++){
        //     char c = binary.charAt(i);
        //     if(c == 1){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        DecimalBinary();
        hammingWeight(n);
    }
}