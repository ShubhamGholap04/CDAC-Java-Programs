//Given a sorted array, remove duplicate elements in-place so that each distinct value appears only once.

import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter sorted elements:");

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int j = 1;

        for(int i = 1; i < a.length; i++)
        {
            if(a[i] != a[i - 1])
            {
                a[j] = a[i];
                j++;
            }
        }

        System.out.println("New length = " + j);

        System.out.println("Unique elements:");

        for(int i = 0; i < j; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}