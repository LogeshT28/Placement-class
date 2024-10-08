// Given two non-negative integers n1 and n2 ,where n1 < n2.The task is to find the total number of integers in the range interval [n1,n2] which have no
// repeatvie digits that number will be magical number.
// There is the number l1,which has repeated digits,but 12,13,14,15 have no reapted digits.so the output is 4.

// IP:11 15 OP: 4
// IP 121 140 OP: 16
public class RepaetiveNumbers {
    public static void main(String[] args) {
        int count=0;
        int num1=0,temp=0,rem=0,num2=0;
        boolean flag=false;
        for(int i=num1;i<=num2;i++){
            int dig = temp%10;
            if(rem==dig){
                flag=true;
                break;
            }
            temp = temp/10;
        }
        if(flag = true){
            break;
        }
        temp = 9;
    }
    if(flag == false){
       // count++;
    }
    System.out.println(count);
}



