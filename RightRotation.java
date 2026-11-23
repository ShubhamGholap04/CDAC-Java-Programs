//Write a program to rotate an array to the right by k positions.

import java.util.Scanner;

public class RightRotation
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        for(int r = 1; r <= k; r++)
        {
            int last = a[n - 1];

            for(int i = n - 1; i > 0; i--)
            {
                a[i] = a[i - 1];
            }

            a[0] = last;
        }

        System.out.println("Array after rotation:");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}