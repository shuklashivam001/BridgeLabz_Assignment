import java.util.Scanner;

public class NaturalSumCompare {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recursive = sumRecursive(n);
        int formula = sumFormula(n);

        System.out.println("Recursive Sum: " + recursive);
        System.out.println("Formula Sum: " + formula);
        System.out.println("Match: " + (recursive == formula));
    }
}