import java.util.Scanner;
class Ypattern
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==(n-1-i))
				{
					System.out.print("# ");
				}
				else if(i==j && i<=mid)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}