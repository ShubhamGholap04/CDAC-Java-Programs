//Write a program to read an array and a key value. Search for the key using Linear Search.
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer n:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " integers:");

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key value:");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == key)
            {
                System.out.println("Key found at index: " + i);
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Key not found");
        }

        sc.close();
    }
}
