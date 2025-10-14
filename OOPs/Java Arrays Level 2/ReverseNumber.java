import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int copyNum = num;
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        int[] digits = new int[count];
        int idx = 0;
        while(copyNum!=0){
            digits[idx] = copyNum%10;
            copyNum/=10;
            idx++;
        }
        System.out.println(Arrays.toString(digits));
    }
}
