//Write a program to read a positive integer and calculate the sum of all its digits.
import java.util.Scanner;

public class Sum_Of_Digits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an interger n:");
        
        int n = sc.nextInt();
        
        int sum = 0;
        
        while(n > 0)
        {
            sum = sum + n % 10;
            n = n /10;
        }
        System.out.print("sum =" + sum);
        sc.close();
    }    
}
