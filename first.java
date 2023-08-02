//method 1 
/*public class first{
    public static void main(String[] args){
        System.out.println("hello\nsania verma");
    }
}*/
import java.util.Scanner;
public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input your first name:");
        String a = input.next();
        System.out.print("Input your last name");
        String b = input.next();
        System.out.print("hello \n" +a+" " +b);
        input.close();
    }
}
