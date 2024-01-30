import java.util.*;
class P1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		 
		System.out.print("Enter your roll no\n");
		int roll=sc.nextInt();
		System.out.print("Enter your department\n");
		System.out.flush();
		String dept=sc.next();
		
		System.out.print("Enter your year of admission");
		int year=sc.nextInt();
		System.out.println(name+"\nRoll no:"+roll+"\n"+dept+"\t"+year);
		sc.close();
	}
}
