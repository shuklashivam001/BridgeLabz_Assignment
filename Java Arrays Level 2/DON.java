import java.util.Scanner;

public class DON {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;
        while(num!=0){
            if(idx==maxDigit) break;
            int ld = num%10;
            digits[idx] = ld;
            idx++;
            num = num/10;
        }
        int largest = 0, secondLargest = 0;
        for(int i=0; i<digits.length; i++){
            if(digits[i]>=largest) largest = digits[i];
            else if(digits[i]>=secondLargest && secondLargest!=largest) secondLargest = digits[i];
        }
        System.out.println("Largest : "+largest+"\nSecond Largest : "+secondLargest);
    }
}
