//Write a program to reverse the elements of an array without creating a second array.
import java.util.Scanner;

public class ArrayReversing_InPlace
{
    public static void main(String[] args)
    {
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer n:");
        int n = sc.nextInt();
        a = new int[n];

        for(int i = 0; i < a.length; i++)
        {
            System.out.print("\nEnter element for a[" + i + "]:");
            a[i] = sc.nextInt();
        }

        System.out.print("\nEntered elements in reverse order are \n");
        
        // Reversed for loop: starts at last index and goes down to 0
        for(int i = a.length - 1; i >= 0; i--)
        {
            System.out.print("\na[" + i + "]:" + a[i]);
        }
        
        sc.close();
    }
}