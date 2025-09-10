import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int maxIndex = 10;
        int[] factors = new int[maxIndex];
        int idx=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(idx==maxIndex){
                    maxIndex*=2;
                    int[] temp = new int[maxIndex];
                    System.arraycopy(factors, 0, temp, 0, idx);
                    factors = temp;
                }
                factors[idx++]=i;
            }
        }
        System.out.println(Arrays.toString(factors));
    }
}
