import java.util.Scanner;

public class VariableSizeArray{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][];

        a[0] = new int[5];
        a[1] = new int[2];
        a[2] = new int[4];

        for(int i = 0; i < a.length; i++)
        {
            System.out.println("Enter elements for row " + i + ":");

            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nArray is:");

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\na.length : " + a.length);
        System.out.println("a[0].length : " + a[0].length);
        System.out.println("a[1].length : " + a[1].length);
        System.out.println("a[2].length : " + a[2].length);
    }
}
