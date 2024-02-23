import java.util.*;
class P20{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int sum=0,max,min,flag=0;
		float avg,n;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=(int)(99*Math.random() +1);
			sum=sum+arr[i];
		}	
		System.out.print("Array is: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("| "+arr[i]+" |");
		}
		System.out.println();	
		max=arr[0];
		min=arr[0];
		for(int i=0;i<10;i++)
		{
			if(arr[i]>max)
			max=arr[i];
			if(arr[i]<min)
			min=arr[i];
		}
		avg=sum/10;
		System.out.println("The sum of the array i: "+sum);
		System.out.println("The average of the array is: "+avg);
		System.out.println("The max value is: "+max);
		System.out.println("The min value is: "+min);
		System.out.println("Enter the number to be searched: ");
		n=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(n==arr[i])
			{
			System.out.println("Value present at index: "+i);
			flag=1;
			break;
			}
		}
		if(flag==0)
		System.out.println("Value not found: ");
		
	}
}
			
		
	
