import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int i : arr){
            if(i<0) System.out.println("Invalid Age!!");
            else if(i>=18) System.out.println("The student with age "+i+" can vote.");
            else System.out.println("The student with age "+i+" cannot vote.");
        }
    }
}