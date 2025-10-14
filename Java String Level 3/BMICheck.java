import java.util.Scanner;

public class BMICheck {

    public static String[] getBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[] bmiStatus = getBMIStatus(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(data);
        displayTable(result);
    }
}