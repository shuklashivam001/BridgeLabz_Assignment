import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] height = new double[3];
        int[] age = new int[3];
        for(int i=0; i<3; i++){
            height[i] = scan.nextInt();
            age[i] = scan.nextInt();
        }
        double maxHeight = height[0];
        int maxAge = age[0];
        for(int i=0; i<3; i++){
            if(height[i]>=maxHeight) maxHeight = height[i];
            if(age[i]>=maxAge) maxAge = age[i];
        }
        System.out.println("Youngest : "+maxAge+"\nTallest : "+maxHeight);
    }
}
