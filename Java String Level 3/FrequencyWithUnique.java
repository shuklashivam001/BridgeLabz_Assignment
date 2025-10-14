import java.util.Scanner;

public class FrequencyWithUnique {

    public static char[] findUniqueChars(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static int[] getFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }

    public static String[][] buildTable(String text) {
        char[] unique = findUniqueChars(text);
        int[] freq = getFrequencies(text);
        String[][] table = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            table[i][0] = String.valueOf(unique[i]);
            table[i][1] = String.valueOf(freq[unique[i]]);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = buildTable(text);
        System.out.println("Char\tFrequency");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}