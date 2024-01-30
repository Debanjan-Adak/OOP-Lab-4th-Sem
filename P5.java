import java.util.*;

public class P5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        int ch, t;
        while (exit == 0) {
            System.out.println(
                    "Enter 1 to print 1 2 4 7 11....  series\nEnter 2 to print fibonacchi series\nEnter 3 to exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the number of terms");
                    t = sc.nextInt();
                    int x = 1;
                    for (int i = 0; i < t; i++) {
                        System.out.print(x + i + "\t");
                        x = x + i;
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the number of terms");
                    t = sc.nextInt();
                    int a = 0, b = 1, c;
                    System.out.print(a + "\t" + b + "\t");
                    for (int i = 2; i < t; i++) {
                        c = a + b;
                        System.out.print(c + "\t");
                        a = b;
                        b = c;
                    }
                    System.out.println();
                    break;

                case 3:
                    exit = 1;
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
        sc.close();
    }

}