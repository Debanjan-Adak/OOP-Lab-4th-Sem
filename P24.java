import java.util.*;
class Student {
    String name;
    double score[];
    int size;

    Student() {
        name = "";
        score = new double[5];
    }

    Student(String N, double a[]) {
        name = N;
        score = a;

    }

    double avg() {
        double avg = 0.0;
        for (int i = 0; i < score.length; i++) {
            avg = avg + score[i];
        }
        int a = score.length;
        avg = avg / a;
        return avg;
    }

    double highest() {
        double highest = 0.0;
        for (int i = 0; i < score.length; i++) {
            if (highest <= score[i])
                highest = score[i];

        }
        return highest;
    }

    double lowest() {
        double lowest = 0.0;
        for (int i = 0; i < score.length; i++) {
            if (lowest <= score[i])
                lowest = score[i];

        }
        return lowest;
    }

    void details() {
        System.out.println("Name of the student is: " + name);
        for (int i = 0; i < score.length; i++) {
            System.out.print(" " + score[i]);
        }
        System.out.println();

    }

}

class StudentGrading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student obj[] = new Student[10];
        int ans = 1, ch;
        while (ans == 1) {
            System.out.println("||      Choices     ||");
            System.out.println("1.Add a new student.\n2.Display students with Highest test score\n3.Display students with Lowest test score\n4.Display students with Highest average score\n5.Display students with Lowest average score");
            System.out.println("5.Exit");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                System.out.println("Invalid choice");

            }
        }
    }

}

public class P24 {
    public static void main(String args[]) {

    }

}