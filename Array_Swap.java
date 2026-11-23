//Write a Java program to create a method:
//swap(int[] a, int i, int j)
//The method should swap the elements present at index i and index j of the given array.
//Use this method to swap the first and last elements of an array.
import java.util.Scanner;

public class Array_Swap
{
    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements:");

        for(int i=0; i< a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        swap(a, 0, a.length-1);

        System.out.print("Array after swaping:");

        for(int i=0; i< a.length; i++)
        {
            System.out.print(a[i]+"");
        }
    }
    
    
}
