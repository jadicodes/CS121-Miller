//*********************************
//Jadi Miller
//Data Structures
//1/30/2023
//*********************************
//Program asks user for a number and then determines whether it is even or odd.
//*********************************
import java.util.Scanner;
public class EvenOrOdd {
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        Integer number;
        System.out.println("Enter an integer: ");
        number = Integer.valueOf(keyboard.nextLine());
        Integer remainder;
        remainder = number%2;
        if (remainder == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


    }


}