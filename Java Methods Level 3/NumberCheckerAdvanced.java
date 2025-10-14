public class NumberCheckerAdvanced {

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int[] digits = NumberChecker.getDigits(num);
        int sum = 0;
        for (int d : digits) sum += factorial(d);
        return sum == num;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}