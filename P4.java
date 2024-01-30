import java.util.*;

public class P4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        int ch, num;
        while (exit == 0) {
            System.out.println("Enter 1 to check for odd/even\nEnter 2 to check for palindrome\nEnter 3 to exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the number to check");
                    num = sc.nextInt();
                    if (num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;
                case 2:
                    System.out.println("Enter the number to check");
                    num = sc.nextInt();
                    int x = num, res = 0, temp;
                    while (x > 0) {
                        temp = x % 10;
                        res = res * 10 + temp;
                        x = x / 10;
                    }
                    if (res == num)
                        System.out.println(num + " is a Palindrome Number");
                    else
                        System.out.println(num + " is not a Palindrome Number");
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