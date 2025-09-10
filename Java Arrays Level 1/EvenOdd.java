import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int i : arr){
            if(i==0) System.out.println("Zero");
            else if(i<0) System.out.println("Negative");
            else{
                if(i%2==0) System.out.println("Even");
                else System.out.println("Odd");
            }
        }
        if(arr[0]==arr[arr.length-1]) System.out.println("First and last element are equal");
        else if(arr[0]>arr[arr.length-1]) System.out.println("First element is greater than last");
        else System.out.println("First element is smaller than last");
    }
}
