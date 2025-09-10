public class ProfitOrLoss {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double profitPercent = (profit)/cp * 100;
        System.out.println("The Cost price is INR "+cp+" and Sell price is INR "+sp+"\nThe profit is INR "+profit+" and the profit percentage is "+profitPercent);
    }
}