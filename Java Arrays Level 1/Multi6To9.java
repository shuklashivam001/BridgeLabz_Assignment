import java.util.Scanner;

public class Multi6To9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] mr = new int[4];
        int k = 6, p = 6;
        for(int i=0; i<mr.length; i++){
            mr[i] = k*number;
            k++;
        }
        for(int i : mr){
            System.out.println(number+" * "+p+" = "+i);
            p++;
        }
    }
}
