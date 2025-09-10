import java.util.Scanner;
public class AbundantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum > number ? "Abundant Number" : "Not an Abundant Number");
    }
}