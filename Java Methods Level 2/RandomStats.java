import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Generated Numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f\nMin: %.0f\nMax: %.0f\n", stats[0], stats[1], stats[2]);
    }
}