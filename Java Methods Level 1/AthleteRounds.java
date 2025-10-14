import java.util.Scanner;

public class AthleteRounds {

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter side B (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter side C (m): ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Athlete must complete " + rounds + " rounds to run 5 km.");
    }
}