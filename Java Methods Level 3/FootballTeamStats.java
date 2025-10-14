import java.util.Random;

public class FootballTeamStats {

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.printf("Mean Height: %.2f cm\n", mean(heights));
    }
}