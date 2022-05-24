import java.util.Scanner;

public class Main {



    public static double calculateEmployeeSalary (double hourlyRate, double HoursPerWeek) {
        return hourlyRate* HoursPerWeek * 52;
    }

    public static void main(String[] args) {
        double salary = calculateEmployeeSalary (45,40);
        System.out.println(salary);
    }
}
