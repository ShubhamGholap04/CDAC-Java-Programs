//Write a program to check whether the given number is even or odd.
import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close();
    }
}
