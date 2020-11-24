package genericprograms;

import java.util.Scanner;

public class CheckPalindromeNumber {

    /*
    * This boolean function will check and return true if the number is Palindrome
     */
    public static boolean isPalindromeNumber(int number){
        int result = 0 , remainder, originalNumber;
        originalNumber = number;
         while(number > 0){
             remainder = number % 10;
             result = remainder + (result *10);
             number = number /10 ;
         }
         if(originalNumber == result)
             return true;
         else
             return false;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        System.out.println("Enter the number to check: ");
        inputNumber = scan.nextInt();
        if(isPalindromeNumber(inputNumber))
            System.out.println("The entered number " + inputNumber + " is Palindrome");
        else
            System.out.println("The entered number " + inputNumber + " is not Palindrome");
        scan.close();
    }
}
