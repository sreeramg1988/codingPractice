import java.util.Scanner;

public class FactorialOfANumber {

    public static int inputNumber;

    /*
    * This function is to find the factorial of an input number.
     */
     public static void findFactorial(int number){
         int result = 1;
         for(int i = 1; i <= number; i++){
             result = result * i;
         }
        System.out.println("The factorial of the number is: " + result);
     }

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        inputNumber = scan.nextInt();
        if(inputNumber == 0 || inputNumber < 0){
            System.out.println("Please enter a positive, non-zero number");
             }
        System.out.println("Input number: " + inputNumber);
        findFactorial(inputNumber);
        scan.close();
    }
}
