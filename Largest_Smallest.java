//Write a program to find the largest and smallest element in an array.
import java.util.Scanner;

public class Largest_Smallest 
{
    public static void main(String[] args) 
    {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer n:");

        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter "+n+" integers:");

        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        
        int largest= a[0];

        int smallest= a[0];

        for(int i=1; i<n; i++)
        {
            if(a[i] > largest)
            {
                largest=a[i];
            }
            if(a[i] < smallest)
            {
                smallest=a[i];
            }
        }

        System.out.println("largest is:" + largest);
        System.out.println("smallest is:" + smallest);
        sc.close();

    }

}
