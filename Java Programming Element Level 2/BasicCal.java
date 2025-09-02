import java.util.Scanner;
public class BasicCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+" is "+(n1+n2)+", "+(n1-n2)+", "+(n1*n2)+", and "+(n1/n2));
    }
}
