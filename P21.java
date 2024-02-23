import java.util.*;
public class P21
{
	public static void main(String args[])
	{
		int cmn[]=new int[5];
		int c=0,sum1=0,sum2=0;
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			arr1[i]=(int)(Math.random()*499 +1);
			arr2[i]=(int)(Math.random()*499 +1);
		}
		
	
		System.out.print("Array 1: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Array 2: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr1[i]==arr2[j])
				{
				
				cmn[i]=arr2[j];
				arr1[i]=0;
				arr2[j]=0;
				c++;
				break;
				}
				
			}
		}
		
		System.out.println("The number of common elements: "+c);
		for(int i=0;i<5;i++)
		{
			sum2=sum2+arr1[i]+arr2[i];
			sum1=sum1+cmn[i];
		}
		System.out.println("The sum of common elements: "+sum1);
		System.out.println("The avg of non common elements: "+(int)(sum2/(10-c)));
		
	}
	}				
