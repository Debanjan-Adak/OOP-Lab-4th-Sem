import java.util.*;
public class P3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		int x=num,res=0,temp;
		while(x>0)
		{
			temp=x%10;
			res=res*10+temp;
			x=x/10;
		}
		if(res==num)
		System.out.println(num+" is a Palindrome Number");
		else
		System.out.println(num+" is not a Palindrome Number");	
        sc.close();
	}
}			