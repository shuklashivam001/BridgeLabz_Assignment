import java.util.*;

public class MultiplicationArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mtarr = new int[10];
        for(int i=0; i<10; i++){
            mtarr[i] = n*(i+1);
        }
        // System.out.println(Arrays.toString(mtarr));
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+mtarr[i-1]);
        }
    }
}
