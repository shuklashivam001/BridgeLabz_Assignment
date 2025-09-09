import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of persons : ");
        int nop = scan.nextInt();
        double[] weight = new double[nop];
        double[] height = new double[nop];
        double[] bmi = new double[nop];
        String[] status = new String[nop];
        System.out.println("Enter weight of persons : ");
        for(int i=0; i<nop; i++){
            weight[i] = scan.nextDouble();
        }
        System.out.println("Enter height of persons : ");
        for(int i=0; i<nop; i++){
            height[i] = scan.nextDouble();
        }
        for(int i=0; i<nop; i++){
            bmi[i] = weight[i]/height[i]/height[i];
        }
        for(int i=0; i<nop; i++){
            if(bmi[i]<=18.4) status[i] = "Underweight";
            else if(bmi[i]>18.5 && bmi[i]<=24.9) status[i] = "Normal";
            else if(bmi[i]>25.0 && bmi[i]<=39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("Height : "+Arrays.toString(height));
        System.out.println("Weight : "+Arrays.toString(weight));
        System.out.println("BMI : "+Arrays.toString(bmi));
        System.out.println("Weight Status : "+Arrays.toString(status));
    }
}