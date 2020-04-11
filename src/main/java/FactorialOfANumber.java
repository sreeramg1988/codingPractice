import java.util.Scanner;

public class FactorialOfANumber {

    public static int inputNumber;

    /*
    * This function is to find the factorial of an input number.
     */
     public static int findFactorial(int number){
         if(number <= 1)
             return 1;
         else
             return number*findFactorial(number-1);
     }

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        inputNumber = scan.nextInt();
        System.out.println(findFactorial(inputNumber));
        scan.close();
    }
}
