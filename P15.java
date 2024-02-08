import java.util.*;
class Student2{
    int id,roll,year;
    String Name;
    Scanner sc=new Scanner(System.in);
    void getData()
    {
        
        System.out.println("Enter your Name");
     
        sc.hasNextLine();
        Name = sc.nextLine();
        
        System.out.println("Enter your id ");
        id=sc.nextInt();
        System.out.println("Enter your roll no");
        roll=sc.nextInt();
        System.out.println("Enter your year of joining");
        System.out.flush();
        year=sc.nextInt();
        sc.close();
    }
    void printData()
    {
        System.out.println("Name:"+Name);
        System.out.println("ID: "+id+" roll "+roll);
        System.out.println("Year "+year);
        
        
    }
}
public class P15 {
    public static void main(String args[])
    {
        
        Student2 s1=new Student2();
        
        s1.getData();
        s1.printData();
        Student2 s2=new Student2();
        s2.getData();
        s2.printData();
    }
    
}


