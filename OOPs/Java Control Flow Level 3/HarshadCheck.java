import java.util.Scanner;
public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int temp = number, sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(number % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
    }
}