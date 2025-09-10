import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] frequency = new int[10];

        while (n != 0) {
            int digit = n % 10;
            frequency[digit]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}