import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class _2104412_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String dateInput = sc.nextLine();
            try {
                // Remove the surrounding quotes
                dateInput = dateInput.replaceAll("^\"|\"$", "");

                LocalDate inputDate = LocalDate.parse(dateInput);
                
                int year = inputDate.getYear();
                int month = inputDate.getMonthValue();
                int day = inputDate.getDayOfMonth();
                
                String reversedDate = String.format("%02d/%02d/%04d", day, month, year);

                System.out.println("Output: \"" + reversedDate + "\"");
                break; // Break out of the loop if the input is valid
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter a date in the format \"yyyy-MM-dd\".");
            }
        }
        sc.close();
    }
}
