import java.util.Random;

public class StudentScorecard {

    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(41) + 60;
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }
        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2],
                stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 10;
        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
    }
}