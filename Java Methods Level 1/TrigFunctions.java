import java.util.Scanner;

public class TrigFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f\n", result[0]);
        System.out.printf("Cosine: %.4f\n", result[1]);
        System.out.printf("Tangent: %.4f\n", result[2]);
    }
}