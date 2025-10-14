import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[10];
        int i=0;
        while(true){
            double n = scan.nextDouble();
            if(n<=0) break;
            else{
                arr[i] = n;
                i++;
            }
            if(i>=10) break;
        }
        double sum = 0;
        for(int j=0; j<arr.length; j++){
            sum+=arr[j];
        }
        System.out.println(sum);
    }
}
