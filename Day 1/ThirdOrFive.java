import java.util.*;
class ThirdOrFive{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num = s.nextInt();
	if(num%3 == 0 && num%5 == 0){
	System.out.println("Welcome Home ");	
	}
	else if(num%3==0){
	System.out.println("Hai !!");	
	}
	else if(num%5==0){
	System.out.println("Hello !!");	
	}
	else {
	System.out.println("Quit !!");	
	}
}
}