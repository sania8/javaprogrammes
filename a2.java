import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the date (eg. yyyy-MM-dd): ");
            String dateInput = sc.nextLine();
            try {
                // Attempt to parse the input as a LocalDate
                LocalDate date = LocalDate.parse(dateInput);
                int n = dateInput.length();
                String date2 = dateInput.replace('-','/');
                int i =n-1;
                String s ="";
                while(i>=0)
                {
                    char x = date2.charAt(i);
                    s = s+x;
                    i--;
                }
                System.out.print("Output:"+ s);
                break; // Break out of the loop if the input is valid
            } catch (DateTimeParseException e) {
                // Catch the exception if the input cannot be parsed as a valid date
                System.out.println("Invalid date format. Please enter a date in the format yyyy-MM-dd.");
            }
        }
        sc.close();
    }
}
