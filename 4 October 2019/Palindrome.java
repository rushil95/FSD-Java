import java.util.Scanner;

class Palindrome {
    String checkIfPalindrome(String s) {
        String reversedString = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            reversedString = reversedString + s.charAt(i);
        }

        reversedString = reversedString.toLowerCase();
        s = s.toLowerCase();

        if (s.equals(reversedString))
            return "Palindrome";
        else
            return "Not A Palindrome";
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String strinput = sc.nextLine();
        String result = checkIfPalindrome(strinput);
        System.out.println(result);
        sc.close();
    }

    public static void main(String[] args) {

        Palindrome pal = new Palindrome();
        pal.getInput();
    }
}