
import java.util.Scanner;

public class Java_Input_1 { 
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//2
        System.out.println("Enter a number:");
        int number=sc.nextInt();//Java does support dynamic declaration of variables. Variables can be declared anywhere as per the need but they are only alive till the scope of the variable in one control scope.
        System.out.println("Entered number is "+number);
        System.out.println("Enter float number:");
        float f_number=sc.nextFloat();//Java does support dynamic declaration of variables. Variables can be declared anywhere as per the need but they are only alive till the scope of the variable in one control scope.
        System.out.println("Entered float number is "+f_number);
        sc.close();//Flushes the buffer, frees the RAM. 
    }

}
