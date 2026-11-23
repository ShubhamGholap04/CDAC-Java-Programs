//Write a program to move all 0 elements to the end of the array while maintaining the original relative order of all non-zero elements.
//The operation should be performed in-place.


import java.util.Scanner;

public class MoveZeros
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int j = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != 0)
            {
                a[j] = a[i];
                j++;
            }
        }

        while(j < a.length)
        {
            a[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeros:");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
