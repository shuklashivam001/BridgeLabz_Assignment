import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        double inches = height/2.54;
        double feet = inches/12;
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    }
}