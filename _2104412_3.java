import java.util.Scanner;
public class _2104412_3 {
    public static void main(String[] args)
    {
        int characters = 0;
        //making an object from sacnner
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String a = sc.nextLine();
        boolean wordStarted = false;
        int x = a.length();
        int words=0;
        for (int i = 0; i <=x-1; i++) {
            char c = a.charAt(i);
            if (c!=' '){
                characters++;
            }
            if (Character.isWhitespace(c)) {
                wordStarted = false;
            } else {
                if (!wordStarted) {
                    words++;
                    wordStarted = true;
                }
            }
        }

        System.out.println("Output:" +words*characters);
        sc.close();
    }
}

