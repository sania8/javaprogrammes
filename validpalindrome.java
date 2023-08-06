import java.util.Scanner;

public class validpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String x = sc.nextLine();
        int b = x.length();
        String str = "";

        for (int i = 0; i < b; i++) {
            char a = x.charAt(i);
            if (Character.isLetter(a)) {
                str += Character.toLowerCase(a);
            }
        }

        boolean isPalindrome = true;
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        sc.close();
    }
}
