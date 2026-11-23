//Write a program to read n integers into an array and count how many elements are even and how many are odd.
import java.util.Scanner;

public class EvenandOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer n:");

        int n = sc.nextInt();

        int a[] = new int[n];

        int evenCount = 0;

        int oddCount = 0;
        
        System.out.println("Enter "+n+" integers:");

        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();

            if (a[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }

        }
        System.out.println("evenCount are: " +evenCount);
        
        System.out.println("oddCount are: " +oddCount);

        sc.close();
    }    
}
