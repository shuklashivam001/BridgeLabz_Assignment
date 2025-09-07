import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] even = new int[n/2+1];
        int[] odd = new int[n/2+1];
        int idxEven = 0, idxOdd = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                even[idxEven] = i;
                idxEven++;
            }
            else{
                odd[idxOdd] = i;
                idxOdd++;
            }
        }
        System.out.println("Even = "+Arrays.toString(even));
        System.out.println("Odd = "+Arrays.toString(odd));
    }
}
