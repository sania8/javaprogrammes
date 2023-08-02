import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        String sub = s.substring(s.indexOf(" ") + 1); // Extract the remaining part of the input
        String sub1 = s.substring(0, s.indexOf(" "));
        int n = sub.length();
        if (sub.toLowerCase().contains(sub1.toLowerCase())) {
            System.out.println("Output: " + n + " " + sub.toUpperCase() + "Substring Found");
        } else {
            System.out.println("Output: " + n + " " + sub.toUpperCase() + "Substring Not Found");
        }
        sc.close();
    }
    
}
