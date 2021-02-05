package stringoperations;

import java.util.Scanner;

public class ReverseASentence {


    static String reverseSentence(String inputString){
        String outputString = "";

        String [] wordsInString = inputString.split("\\s");
        for(int i = wordsInString.length - 1; i >= 0 ; i--){
            outputString = outputString + wordsInString[i] + " ";
        }

        return outputString;
    }

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse.");
        if(scan.hasNext()) {
            String inputString = scan.nextLine();
            System.out.println("The reversed sentence is: " + reverseSentence(inputString));
        }else{
            System.out.println("Enter a valid string");
        }
    }
}
