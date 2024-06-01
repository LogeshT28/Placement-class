//1.Get the input from user,
//2.use If case to find the given input is Vowel or Constant

import java.util.*;
class VowelsOrConstant{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	char c= s.next().charAt(0);
	if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ){
		System.out.println("The character is Vowel");
}
	else{
		System.out.println("The character is Constant");			
}
}
}