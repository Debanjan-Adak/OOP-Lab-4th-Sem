import java.util.*;
class P7
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		n1=sc.nextInt();
		System.out.println("Enter the Second number");
		n2=sc.nextInt();
		if(n1%n2==0)
		System.out.println("Yes "+n1+" is a multiple of "+n2);
		else
		System.out.println("No "+n1+" is not a multiple of "+n2);
		sc.close();
	}
}		
