import java.util.*;
class P23{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int temp;

		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=(int)(Math.random()*99+1);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
			System.out.print("Array: ");
			for(int j=0;j<n;j++)
			System.out.print("| "+arr[j]+" |");
			System.out.println();
		}
		sc.close();
	}
}				
		
