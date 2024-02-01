import java.util.*;
class P9
{
	public static void main(String args[])
	{
		float miles,avgmiles,gas,park,tolls,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total miles driven per day");
		miles=sc.nextFloat();
		System.out.println("Enter cost per gallon of Gasoline");
		gas=sc.nextFloat();
		System.out.println("Enter average miles per gallon ");
		avgmiles=sc.nextFloat();
		System.out.println("Enter parking fee per day");
		park=sc.nextFloat();
		System.out.println("Enter tolls per day");
		tolls=sc.nextFloat();
		total=tolls+park+(miles*gas/avgmiles);
		
		System.out.println("Your total is "+total);
		sc.close();
	}
}		
