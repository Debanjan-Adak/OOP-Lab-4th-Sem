import java.util.*;
public class P18 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            System.out.print(" ");
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
