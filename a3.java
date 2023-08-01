import java.util.Scanner;
public class a3 {
    public static void main(String[] args)
    {
        int s =0;
        //making an object from sacnner
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String a = sc.nextLine();
        int x = a.length();
        for(int i =0; i<=x-1; i++)
        {
            if(a.charAt(i)==' '){
                s++;
            }
        }
        System.out.print("Output:" + s);
    }
    
    
}
