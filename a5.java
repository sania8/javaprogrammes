//palindrome string
import java.util.Scanner;
public class a5{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String str = sc.nextLine();
        int n = str.length();
        String s = "";
        int i = n-1;
        while(i>=0)

        {
            char x  = str.charAt(i);
            s = s+x;
            i--;
        }
        
        if(str.equals(s))
        {
            System.out.print("Output:"+"yes");
        }
        else{
            System.out.print("Output:"+"No");
        }
        sc.close();

    }
}