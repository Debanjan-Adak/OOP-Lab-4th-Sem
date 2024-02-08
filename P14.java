import java.util.*;
public class P14 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ladder number limit ");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            System.out.println("______");
            System.out.printf("| %2d |",i);
            System.out.println();
        }
        sc.close();
    }
}