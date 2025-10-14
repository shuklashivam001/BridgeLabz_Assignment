import java.util.Random;

public class EmployeeBonus {

    public static int[][] generateSalaryAndService(int count) {
        Random rand = new Random();
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // Salary
            data[i][1] = rand.nextInt(11); // Years of service
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tSalary\tService\tNewSalary\tBonus");
        for (int i = 0; i < data.length; i++) {
            totalOld += data[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\n", i + 1, data[i][0], data[i][1], result[i][0], result[i][1]);
        }
        System.out.printf("Total Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateSalaryAndService(10);
        double[][] result = calculateBonus(data);
        displaySummary(data, result);
    }
}