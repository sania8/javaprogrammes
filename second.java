import java.util.Scanner;
public class second{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.println(a+"+"+b);
        int c = a+b;
        System.out.print(c);
        sc.close();

    }
}