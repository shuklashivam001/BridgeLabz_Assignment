import java.util.*;

public class PercentCal_2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nos = scan.nextInt();

        int[][] marks = new int[nos][3];
        int[] totalMarks = new int[nos];
        double[] percent = new double[nos];
        String[] grades = new String[nos];

        for (int i = 0; i < nos; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scan.nextInt();
                if (marks[i][j] < 0) {
                    j--;
                }
            }

            totalMarks[i] = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = totalMarks[i] / 3.0;

            if (percent[i] >= 80) grades[i] = "A";
            else if (percent[i] >= 70) grades[i] = "B";
            else if (percent[i] >= 60) grades[i] = "C";
            else if (percent[i] >= 50) grades[i] = "D";
            else if (percent[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        for (int i = 0; i < nos; i++) {
            System.out.printf("Student %d: %d %d %d %.2f %s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grades[i]);
        }
    }
}