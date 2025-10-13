import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println("Using charAt() mathod : "+compareUsingCharAt(str1, str2));
        System.out.println("Using equals() method : "+compareUsingEquals(str1, str2));
    }
    public static boolean compareUsingCharAt(String s1, String s2){
        int sl1 = s1.length();
        int sl2 = s2.length();
        int max = sl1;
        if(sl2>sl1) max = sl2;
        for(int i=0; i<max; i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static boolean compareUsingEquals(String s1, String s2){
        return s1.equals(s2);
    }
}
