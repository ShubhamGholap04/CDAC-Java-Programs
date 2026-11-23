//Accept two numbers from the user and print their addition. A number 
// can be an int, a float, or anything so decide the data type carefully. 
import java.util.Scanner;

public class Addition_of_2 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//2
        System.out.println("Enter 2 numbers:");
        float number1=sc.nextInt();//Java does support dynamic declaration of variables. Variables can be declared anywhere as per the need but they are only alive till the scope of the variable in one control scope.
        float number2=sc.nextInt();
        System.out.println(number1+ " + " +number2+ " = " +(number1+number2));
        sc.close();//Flushes the buffer, frees the RAM.
    }
}
