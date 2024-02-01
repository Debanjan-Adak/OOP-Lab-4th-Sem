import java.util.*;

class P12 {
	public static void main(String args[]) {
		int n1, n2, ch, x = 1;
		Scanner sc = new Scanner(System.in);

		while (x == 1) {
			System.out.println(
					"Enter 1 to check which number is greater\nEnter 2 to check multiple or not\nEnter 3 to exit");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.println("Enter the First number");
					n1 = sc.nextInt();
					System.out.println("Enter the Second number");
					n2 = sc.nextInt();
					if (n1 > n2)
						System.out.println(n1 + " is greater");
					else if (n2 > n1)
						System.out.println(n2 + " is greater");
					else
						System.out.println("Both numbers are equal");
					break;
				case 2:
					System.out.println("Enter the First number");
					n1 = sc.nextInt();
					System.out.println("Enter the Second number");
					n2 = sc.nextInt();
					if (n1 % n2 == 0)
						System.out.println("Yes " + n1 + " is a multiple of " + n2);
					else
						System.out.println("No " + n1 + " is not a multiple of " + n2);
					break;
				case 3:
					x = 0;
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
		sc.close();
	}
}
