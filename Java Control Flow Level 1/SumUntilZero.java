import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value = sc.nextDouble();
        while (value != 0) {
            total += value;
            value = sc.nextDouble();
        }
        System.out.println("Total sum is " + total);
    }
}