//Jadi Miller (solo)
//Data Structures & OOP
//3/20/2023
//Program prompts user for a string and will run function isPalindrome, which checks if the string is a palindrome using recursion.

import java.util.Scanner;
public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String palindrome = keyboard.nextLine();

        if (isPalindrome(palindrome)) {
            System.out.println(palindrome + " is a palindrome.");
        }
        else {
            System.out.println(palindrome + " is NOT a palindrome.");
        }
    }
    public static boolean isPalindrome (String palindrome) {
        if (palindrome.length() <= 1) {
            return true;
        }
        if (palindrome.charAt(0) != palindrome.charAt(palindrome.length() - 1)) {
            return false;
        }
        else {
            return isPalindrome(palindrome.substring(1, palindrome.length() - 1));
        }
    }
}