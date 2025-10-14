import java.util.*;

public class PercentCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nos = scan.nextInt();
        int[] physics = new int[nos];
        int[] chemistry = new int[nos];
        int[] maths = new int[nos];
        int[] marks = new int[nos];
        double[] percent = new double[nos];
        String[] grades = new String[nos];
        for(int i=0; i<nos; i++){
            physics[i] = scan.nextInt();
            chemistry[i] = scan.nextInt();
            maths[i] = scan.nextInt();
            marks[i] = (physics[i] + chemistry[i] + maths[i]);
            percent[i] = marks[i]/3;
            if(percent[i]>=80) grades[i] = "A";
            else if(percent[i]>=70 && percent[i]<79) grades[i] = "B";
            else if(percent[i]>=60 && percent[i]<69) grades[i] = "C";
            else if(percent[i]>=50 && percent[i]<59) grades[i] = "D";
            else if(percent[i]>=40 && percent[i]<49) grades[i] = "E";
            else grades[i] = "R";
        }
        System.out.println("Marks : "+Arrays.toString(marks));
        System.out.println("Percentages : "+Arrays.toString(percent));
        System.out.println("Grades : "+Arrays.toString(grades));
        
    }
}
