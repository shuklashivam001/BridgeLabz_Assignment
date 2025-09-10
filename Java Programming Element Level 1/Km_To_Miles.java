import java.util.*;
public class Km_To_Miles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km = scan.nextInt();
        System.out.println("The total miles is "+(1.6*km)+" mile for the given "+km+" km");
    }
}
