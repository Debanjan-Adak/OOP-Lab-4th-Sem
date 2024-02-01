import java.util.*;
class P8
{
	public static void main(String args[])
	{
		float wt,ht,bmi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight in Kgs");
		wt=sc.nextFloat();
		System.out.println("Enter your height in metres");
		ht=sc.nextFloat();
		bmi=wt/(ht*ht);
		System.out.println("Your BMI is "+bmi);
		sc.close();
	}
}		
