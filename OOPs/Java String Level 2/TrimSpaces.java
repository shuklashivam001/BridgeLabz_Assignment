import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrim = customSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom Trimmed: [" + customTrim + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrim + "]");
        System.out.println("Are both equal? " + compareStrings(customTrim, builtInTrim));
    }
}