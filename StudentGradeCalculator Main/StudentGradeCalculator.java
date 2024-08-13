import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name-");
        String name = sc.nextLine();
        System.out.println("Enter Marks of English-");
        int eng = sc.nextInt();
        if (eng > 100) {
            System.out.println("Alert: Marks for English cannot be greater than 100!");
            return;
        }

        System.out.println("Enter Marks of Maths-");
        int math = sc.nextInt();
        if (math > 100) {
            System.out.println("Alert: Marks for Maths cannot be greater than 100!");
            return;
        }


        System.out.println("Enter Marks of Hindi-");
        int hindi = sc.nextInt();
        if (hindi > 100) {
            System.out.println("Alert: Marks for Hindi cannot be greater than 100!");
            return;
        }

        System.out.println("Enter Marks of Physics-");
        int phy = sc.nextInt();
        if (phy > 100) {
            System.out.println("Alert: Marks for Physics cannot be greater than 100!");
            return;
        }

        System.out.println("Enter Marks of Chemistry-");
        int chem = sc.nextInt();
        if (chem > 100) {
            System.out.println("Alert: Marks for Chemistry cannot be greater than 100!");
            return;
        }

        int sum = eng+phy+chem+math+hindi;
        double per = (sum / 5.0);

        char grade;
        if (per >= 90) {
            grade = 'A';
        } else if (per >= 80) {
            grade = 'B';
        } else if (per >= 70) {
            grade = 'C';
        } else if (per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(name+" has a total "+ sum+ " marks, " + "an average percentage of " +  per + " and a "+ grade + " grade." );
    }
}