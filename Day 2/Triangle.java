import java.util.*;
public class Triangle{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Three Angles :");
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		
		boolean res=  a1+a2+a3 == 180 ? true : false;
		System.out.println("the Given Three Angle Form is "+res);
	}
}