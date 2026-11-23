//Write a program to find the second largest distinct element in an array.
//Duplicate values must not be considered as separate elements.
//If the array does not contain at least two distinct values, print -1.

import java.util.Scanner;

public class Second_Largest
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

        int largest = a[0];
        int second = 0;
        boolean found = false;

        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > largest)
            {
                second = largest;
                largest = a[i];
                found = true;
            }
            else if(a[i] < largest)
            {
                if(!found || a[i] > second)
                {
                    second = a[i];
                    found = true;
                }
            }
        }

        if(found)
            System.out.println("Second largest = " + second);
        else
            System.out.println("-1");
    }
}