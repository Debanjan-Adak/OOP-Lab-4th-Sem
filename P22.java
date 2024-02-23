import java.util.*;
class P22{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int dig=0;
		double sdig=1.0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			arr[i][j]=(int)(Math.random()*49 +1);
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			System.out.printf("| %2d | ",arr[i][j]);
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				dig=dig+arr[i][j];
				if(i+j==2)
				sdig=sdig*arr[i][j];
			}
			
		}
		System.out.println("The sum of main diagonal elements: "+dig);
		System.out.println("The sum of secondary diagonal elements: "+sdig);
		
		
	}
}		
