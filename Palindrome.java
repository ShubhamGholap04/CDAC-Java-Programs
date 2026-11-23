//Write a program to read a string and check whether it is a palindrome.
import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean palindrome = true;

        for(int i = 0; i < s.length() / 2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                palindrome = false;
                break;
            }
        }

        if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}