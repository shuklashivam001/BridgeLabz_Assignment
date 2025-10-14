import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        for(int i=0; i<height.length; i++){
            height[i] = scan.nextDouble();
        }
        for(double i : height){
            sum+=i;
        }
        double mean = sum/11;
        System.out.println(mean);
    }
}
