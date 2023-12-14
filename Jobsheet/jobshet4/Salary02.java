import java.util.Scanner;

/**
 * Salary02
 */
public class Salary02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAttendance, numAbsence;
        int totalsalary, salary=40000, salaryDeduction = 25000;

        System.out.println("Input attendance number:");
        numAttendance = input.nextInt();
        System.out.println("Input absence number: ");
        numAbsence = input.nextInt();
        totalsalary=(numAttendance*salary)-(numAbsence*salaryDeduction);
        System.out.println("total salary: " +totalsalary);
    }
}