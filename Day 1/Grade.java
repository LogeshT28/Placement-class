import java.util.*;
class Grade{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Mark :");
	int mark = s.nextInt();
	if(mark >= 35){
	System.out.println("Your Passed !!");
	if(mark >90){
		System.out.println("Your Eligible For Medical Courses");	
	}
	else if(mark > 80 && mark <90){
		System.out.println("Your Eligible For Engineering Courses");	
	}
	else if(mark < 75 && mark >35){
		System.out.println("Your Eligible For Arts and Science Courses");	

	}
	}
	else{
		System.out.println("Your Failed !! XX ");	

	}
}
}