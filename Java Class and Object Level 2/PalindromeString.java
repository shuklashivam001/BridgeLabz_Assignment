class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    void display() {
        System.out.println("Text : " + text);
        System.out.println("Palindrome : " + isPalindrome());
    }
}