import java.util.*;
public class P16 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the text");
        String n=sc.nextLine();
        int c=1;
        for(int i=0;i<=n.length()-1;i++)
        {
            if(n.charAt(i)==' ')
            c++;
        }
        System.out.println("The number of words are: "+c);
        sc.close();
    }
}