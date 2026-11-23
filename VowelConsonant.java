//Write a program to read a line of text and count the number of vowels and consonants present in it.
import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String s = sc.nextLine();

        int vowel = 0, consonant = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowel++;
            }
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                consonant++;
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);
    }
}