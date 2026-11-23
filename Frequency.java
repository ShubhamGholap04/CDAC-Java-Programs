
//Write a program to read an array and print each distinct element along with the number of times it appears.
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            boolean alreadyPrinted = false;

            // Check if element was already printed
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            // Count occurrence
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }

            System.out.println(a[i] + " = " + count);
        }
    }
}
