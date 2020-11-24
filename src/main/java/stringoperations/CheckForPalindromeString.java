package stringoperations;

import java.util.Scanner;

public class CheckForPalindromeString {

    /**
     * This methodis to check whether the entered String is Palindrome
     * @param inputString
     * @return true if the string is a palindrome
     * @return false if the String is not a palindrome
     */
    public static boolean isPalindromeString(String inputString){
        String resultString = "";
        for(int i = inputString.length()-1; i >= 0; i--){
            resultString = resultString + inputString.charAt(i);
        }
        if(inputString.equalsIgnoreCase(resultString)){
         return  true;
        }
        else{
            return false;
        }
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String inputString = "";
        System.out.println("Enter the String to be checked: ");
        inputString = scan.next();
        if(isPalindromeString(inputString)){
            System.out.println("The String " + inputString + " is a Palindrome");
        }
        else{
            System.out.println("The String " + inputString + " is not a Palindrome");
        }
        scan.close();
    }

}
