import java.util.Scanner;
import java.util.Arrays;
public class a4 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("enter the number of elements u want to add to array:");
      int n = sc.nextInt();
      // Create an array with a fixed size
      int[] a = new int[n];
      for(int i =0;i<n;i++)
      {
        int y = i+1;
        System.out.print("enter"+" "+y+"st"+" "+"element:");
        int x = sc.nextInt();
        a[i] = x;
      }
      System.out.print("Array before sorting:");
      System.out.println("arrays unsorted :"+ Arrays.toString(a));
      //sorting of the array  using bubble sort techniuqe
      for(int i =0 ; i<n;i++)
      {
        for(int j =0; j<i;j++)
        {
            if(a[i]>a[j])
            {
                int k = a[j];
                a[j] =  a[j+1];
                a[j+1] = k;
            }
        }
      }
      System.out.println("Array after sorting");
      System.out.println("Array sorted: "+ Arrays.toString(a));

      sc.close();



    }
    
}
